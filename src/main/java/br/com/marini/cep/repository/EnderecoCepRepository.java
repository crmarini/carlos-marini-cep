package br.com.marini.cep.repository;

import javax.ejb.Local;

import br.com.marini.cep.model.EnderecoCep;

@Local
public interface EnderecoCepRepository{
	String MAPPED_NAME = "EnderecoCepRepository";
	
	public void CadastrarEnderecoCep(EnderecoCep endereco);
	
	public EnderecoCep getEnderecoCep(String numeroCep);
}