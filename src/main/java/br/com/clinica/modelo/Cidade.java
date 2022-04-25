package br.com.clinica.modelo;

public class Cidade {
	
	private Long id;
	private Long codigoIbge;
	private String nomeCidade;
	
	public Cidade() {
	}

	public Cidade(Long id, Long codigoIbge, String nomeCidade) {
		this.id = id;
		this.codigoIbge = codigoIbge;
		this.nomeCidade = nomeCidade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCodigoIbge() {
		return codigoIbge;
	}

	public void setCodigoIbge(Long codigoIbge) {
		this.codigoIbge = codigoIbge;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	@Override
	public String toString() {
		return "CadastroCidade [id=" + id + ", codigoIbge=" + codigoIbge + ", nomeCidade=" + nomeCidade + "]";
	}
	
}
