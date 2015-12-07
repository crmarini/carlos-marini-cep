package br.com.marini.cep.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="tb_edco_cep")
@NamedQuery(name="enderecoCep.findEnderecoCep", query="SELECT end FROM EnderecoCep end WHERE end.numeroCep= :num")
public class EnderecoCep {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	@Column(name="id_cep")
	private Integer idCep;
	
	@Column(name="nu_cep")
	private Integer numeroCep;
	
	@Column(name="ds_edco_cep")
	private String enderecoCep;
	
	@Column(name="ds_bair_edco_cep")
	private String bairroEnderecoCep;
	
	@Column(name="ds_cdde_edco_cep")
	private String cidadeEnderecoCep;
	
	@Column(name="ds_estd_edco_cep")
	private String estadoEnderecoCep;

	public Integer getIdCep() {
		return idCep;
	}

	public void setIdCep(Integer idCep) {
		this.idCep = idCep;
	}

	public Integer getNumeroCep() {
		return numeroCep;
	}

	public void setNumeroCep(Integer numeroCep) {
		this.numeroCep = numeroCep;
	}

	public String getEnderecoCep() {
		return enderecoCep;
	}

	public void setEnderecoCep(String enderecoCep) {
		this.enderecoCep = enderecoCep;
	}

	public String getBairroEnderecoCep() {
		return bairroEnderecoCep;
	}

	public void setBairroEnderecoCep(String bairroEnderecoCep) {
		this.bairroEnderecoCep = bairroEnderecoCep;
	}

	public String getCidadeEnderecoCep() {
		return cidadeEnderecoCep;
	}

	public void setCidadeEnderecoCep(String cidadeEnderecoCep) {
		this.cidadeEnderecoCep = cidadeEnderecoCep;
	}

	public String getEstadoEnderecoCep() {
		return estadoEnderecoCep;
	}

	public void setEstadoEnderecoCep(String estadoEnderecoCep) {
		this.estadoEnderecoCep = estadoEnderecoCep;
	}
}