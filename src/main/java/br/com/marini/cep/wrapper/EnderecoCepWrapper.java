package br.com.marini.cep.wrapper;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import br.com.marini.cep.dto.EnderecoCepDTO;

@XmlRootElement(name="EnderecosCep")
public class EnderecoCepWrapper {
	private List<EnderecoCepDTO> lista;
	
	public EnderecoCepWrapper(){
		
	}

	public List<EnderecoCepDTO> getLista() {
		return lista;
	}

	public void setLista(List<EnderecoCepDTO> lista) {
		this.lista = lista;
	}
}