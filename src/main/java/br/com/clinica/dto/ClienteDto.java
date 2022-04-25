package br.com.clinica.dto;

import br.com.clinica.modelo.Cidade;
import br.com.clinica.modelo.SexoCliente;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteDto {
	
	private long codigo;
	private String nome;
	private String estado;
	private String bairro;
	private String endereco;
	private long numeroEndereco;
	private long cep;
	private long cel;
	private String obs;
	private SexoCliente sexo;
	private Cidade cadastroCidade;

}
