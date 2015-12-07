package br.com.marini.cep.service.impl;

import javax.ejb.Stateless;

import br.com.marini.cep.dto.EnderecoCepDTO;
import br.com.marini.cep.service.EnderecoCepService;

@Stateless(name = EnderecoCepService.MAPPED_NAME, mappedName = EnderecoCepService.MAPPED_NAME)
public class EnderecoCepServiceImpl implements EnderecoCepService {

	@Override
	public EnderecoCepDTO cadastrarEnderecoCep(EnderecoCepDTO enderecoCepDTO) {
		
		return null;
	}

	@Override
	public EnderecoCepDTO buscarEnderecoCep(EnderecoCepDTO enderecoCepDTO) {
		
		return null;
	}

}
