package br.com.clinica.dto;

import java.time.LocalDate;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import br.com.clinica.modelo.Cidade;
import br.com.clinica.modelo.SexoCliente;
import br.com.clinica.modelo.TipoPessoaCliente;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteFormDto {
	
	private long codigo;
	@NotBlank
	private String nome;
	@DecimalMin("9")
	@NotNull
	private long numeroCnpjCpf;
	@NotBlank
	private String estado;
	@NotBlank
	private String cidade;
	private String bairro;
	private String endereco;
	private long numeroEndereco;
	private long cep;
	@NotNull
	private long cel;
	@PastOrPresent
	private LocalDate dataNascimento;
	@Size(max = 250)
	private String obs;
	private SexoCliente sexo;
	private TipoPessoaCliente tipoPessoaCliente;
	private Cidade cadastroCidade;
}
