package br.com.marini.cep.service.impl;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.marini.cep.converter.Conversor;
import br.com.marini.cep.dto.EnderecoCepDTO;
import br.com.marini.cep.model.EnderecoCep;
import br.com.marini.cep.repository.EnderecoCepRepository;
import br.com.marini.cep.service.EnderecoCepService;

@Stateless(name = EnderecoCepService.MAPPED_NAME, mappedName = EnderecoCepService.MAPPED_NAME)
public class EnderecoCepServiceImpl implements EnderecoCepService {

	@Inject
	EnderecoCepRepository dao;
	
	@Inject
	Conversor converter;
	
	@Override
	public EnderecoCepDTO cadastrarEnderecoCep(EnderecoCepDTO enderecoCepDTO) {
		if(!verificarCepInformadoValido(enderecoCepDTO)){
			return new EnderecoCepDTO("ERRO", "O CEP informado é inválido");
		}
		return buscarCepCadastro(enderecoCepDTO);
	}

	@Override
	public EnderecoCepDTO buscarEnderecoCep(EnderecoCepDTO enderecoCepDTO) {
		if(!verificarCepInformadoValido(enderecoCepDTO)){
			return new EnderecoCepDTO("ERRO", "O CEP informado é inválido");
		}
		if(enderecoCepDTO.getNumeroCep().equals("") || enderecoCepDTO.getNumeroCep()==null){
			return new EnderecoCepDTO("ERRO", "O CEP informado é inválido");
		}
		return buscarCep(enderecoCepDTO);
	}
	
	private EnderecoCepDTO buscarCepCadastro(EnderecoCepDTO enderecoCepDTO){
		EnderecoCep endereco = dao.getEnderecoCep(enderecoCepDTO.getNumeroCep().replace("-", ""));
		if (endereco!=null){
			return new EnderecoCepDTO("ERRO", "O CEP informado não foi encontrado");
		}
		else{
			endereco = converter.converterEntidade(enderecoCepDTO);
			dao.CadastrarEnderecoCep(endereco);
			return new EnderecoCepDTO("SUCESSO", "O endereço foi cadastrado com sucesso.");
		}
	}
	
	private EnderecoCepDTO buscarCep(EnderecoCepDTO enderecoCepDTO){
		EnderecoCep endereco = dao.getEnderecoCep(enderecoCepDTO.getNumeroCep().replace("-", ""));
		if (endereco==null){
			return new EnderecoCepDTO("ERRO", "O CEP informado não foi encontrado");
		}
		else{
			return converter.converterDTO(endereco);
		}
	}
	
	private Boolean verificarCepInformadoValido(EnderecoCepDTO enderecoCepDTO){
		if(isNumeric(enderecoCepDTO.getNumeroCep())==0){
			return false;
		}
		return true;
	}

	private Integer isNumeric(String numeroCep){
		try{
			return new Integer(numeroCep.replace("-", ""));
		}catch (Exception e){
			return 0;
		}
	}
}
