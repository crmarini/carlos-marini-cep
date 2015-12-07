package br.com.marini.cep.service;

import javax.ejb.Local;

import br.com.marini.cep.dto.EnderecoCepDTO;

@Local
public interface EnderecoCepService {
	String MAPPED_NAME = "EnderecoCepServico";
	
	public EnderecoCepDTO cadastrarEnderecoCep(EnderecoCepDTO enderecoCepDTO);
	
	public EnderecoCepDTO buscarEnderecoCep(EnderecoCepDTO enderecoCepDTO);
}
