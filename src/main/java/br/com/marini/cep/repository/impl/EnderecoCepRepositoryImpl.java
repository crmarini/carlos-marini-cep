package br.com.marini.cep.repository.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;
import org.apache.log4j.Logger;

import br.com.marini.cep.model.EnderecoCep;
import br.com.marini.cep.repository.EnderecoCepRepository;

@Stateless(name = EnderecoCepRepository.MAPPED_NAME, mappedName = EnderecoCepRepository.MAPPED_NAME)
public class EnderecoCepRepositoryImpl implements EnderecoCepRepository {
	
	private Logger logger = Logger.getLogger(this.getClass());

	@PersistenceContext(name="endereco-cep-pu")
	private EntityManager manager;
	
	@Override
	public void CadastrarEnderecoCep(EnderecoCep endereco) {
		logger.debug("Persistindo: "+endereco.getNumeroCep());
		try{
			manager.persist(endereco);
		}catch(PersistenceException e){
			logger.error(e.getMessage());
		}
	}

	@Override
	public EnderecoCep getEnderecoCep(Integer numeroCep) {
		 TypedQuery<EnderecoCep> query = manager.createNamedQuery("enderecoCep.findEnderecoCep", EnderecoCep.class);
		 query.setParameter("num",numeroCep);
		
		return query.getSingleResult();
	}
}