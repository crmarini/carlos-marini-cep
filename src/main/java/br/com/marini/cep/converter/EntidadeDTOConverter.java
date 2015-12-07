package br.com.marini.cep.converter;

import javax.ejb.Stateless;

import br.com.marini.cep.dto.EnderecoCepDTO;
import br.com.marini.cep.model.EnderecoCep;

@Stateless(name = Conversor.MAPPED_NAME, mappedName = Conversor.MAPPED_NAME)
public class EntidadeDTOConverter implements Conversor {
	public EnderecoCepDTO converterDTO(EnderecoCep endereco) {
		return new EnderecoCepDTO("SUCESSO", endereco.getNumeroCep(), endereco.getEnderecoCep(),
				endereco.getBairroEnderecoCep(), endereco.getCidadeEnderecoCep(), endereco.getEstadoEnderecoCep());
	}

	public EnderecoCep converterEntidade(EnderecoCepDTO endereco) {
		return new EnderecoCep(endereco.getNumeroCep().replace("-", ""), endereco.getEnderecoCep(),
				endereco.getBairroEnderecoCep(), endereco.getCidadeEnderecoCep(), endereco.getEstadoEnderecoCep());
	}
}
