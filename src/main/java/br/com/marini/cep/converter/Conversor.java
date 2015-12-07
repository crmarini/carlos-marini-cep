package br.com.marini.cep.converter;

import javax.ejb.Stateless;

import br.com.marini.cep.dto.EnderecoCepDTO;
import br.com.marini.cep.model.EnderecoCep;

@Stateless(name = Conversor.MAPPED_NAME, mappedName = Conversor.MAPPED_NAME)
public interface Conversor{
	String MAPPED_NAME = "Conversor";
	
	public EnderecoCepDTO converterDTO(EnderecoCep endereco) ;
	
	public EnderecoCep converterEntidade(EnderecoCepDTO endereco);

}
