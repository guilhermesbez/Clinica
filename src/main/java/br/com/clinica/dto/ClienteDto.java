package br.com.clinica.dto;

import br.com.clinica.modelo.SexoCliente;
import br.com.clinica.modelo.TipoPessoaCliente;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteDto {
	
	private String nome;
	private String estado;
	private String bairro;
	private String endereco;
	private Integer numeroEndereco;
	private Integer cep;
	private Integer celular;
	private String obs;
	private SexoCliente sexo;
	private TipoPessoaCliente tipoPessoaCliente;
	private Long cidadeCodigo;
}
