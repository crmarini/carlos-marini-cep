package br.com.marini.cep.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "endereco")
public class EnderecoCepDTO implements Serializable {

	private static final long serialVersionUID = -6474609899407226445L;

	private String status;
	private Integer numeroCep;
	private String enderecoCep;
	private String bairroEnderecoCep;
	private String cidadeEnderecoCep;
	private String estadoEnderecoCep;
	private String mensagem;

	public EnderecoCepDTO() {

	}

	public EnderecoCepDTO(String status, Integer numeroCep, String enderecoCep, String bairroEnderecoCep,
			String cidadeEnderecoCep, String estadoEnderecoCep) {
		super();
		this.status = status;
		this.numeroCep = numeroCep;
		this.enderecoCep = enderecoCep;
		this.bairroEnderecoCep = bairroEnderecoCep;
		this.cidadeEnderecoCep = cidadeEnderecoCep;
		this.estadoEnderecoCep = estadoEnderecoCep;
	}

	public EnderecoCepDTO(String status, String mensagem) {
		this.status = status;
		this.mensagem = mensagem;
	}

	@XmlElement
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@XmlElement
	public Integer getNumeroCep() {
		return numeroCep;
	}

	public void setNumeroCep(Integer numeroCep) {
		this.numeroCep = numeroCep;
	}

	@XmlElement
	public String getEnderecoCep() {
		return enderecoCep;
	}

	public void setEnderecoCep(String enderecoCep) {
		this.enderecoCep = enderecoCep;
	}

	@XmlElement
	public String getBairroEnderecoCep() {
		return bairroEnderecoCep;
	}

	public void setBairroEnderecoCep(String bairroEnderecoCep) {
		this.bairroEnderecoCep = bairroEnderecoCep;
	}

	@XmlElement
	public String getCidadeEnderecoCep() {
		return cidadeEnderecoCep;
	}

	public void setCidadeEnderecoCep(String cidadeEnderecoCep) {
		this.cidadeEnderecoCep = cidadeEnderecoCep;
	}

	@XmlElement
	public String getEstadoEnderecoCep() {
		return estadoEnderecoCep;
	}

	public void setEstadoEnderecoCep(String estadoEnderecoCep) {
		this.estadoEnderecoCep = estadoEnderecoCep;
	}

	@XmlElement
	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	@Override
	public String toString() {
		return "EnderecoCepDTO [status" + status + ", numeroCep=" + numeroCep + ", enderecoCep=" + enderecoCep
				+ ", bairroEnderecoCep=" + bairroEnderecoCep + ", cidadeEnderecoCep=" + cidadeEnderecoCep
				+ ", estadoEnderecoCep=" + estadoEnderecoCep + ", mensagem=" + mensagem + "]";
	}
}