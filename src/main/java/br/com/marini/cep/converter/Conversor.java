package br.com.marini.cep.converter;

import br.com.marini.cep.dto.EnderecoCepDTO;
import br.com.marini.cep.model.EnderecoCep;

public interface Conversor{
	String MAPPED_NAME = "Conversor";
	
	public EnderecoCepDTO converterDTO(EnderecoCep endereco) ;
	
	public EnderecoCep converterEntidade(EnderecoCepDTO endereco);

}
