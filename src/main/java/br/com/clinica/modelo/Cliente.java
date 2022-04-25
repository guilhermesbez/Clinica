package br.com.clinica.modelo;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Cliente {

	private long codigo;
	private String nome;
	private long numeroCnpjCpf;
	private String estado;
	private String cidade;
	private String bairro;
	private String endereco;
	private long numeroEndereco;
	private long cep;
	private long cel;
	private LocalDate dataNascimento;
	private String obs;
	private SexoCliente sexo;
	private TipoPessoaCliente tipoPessoaCliente;
	private Cidade cadastroCidade;
	
}
