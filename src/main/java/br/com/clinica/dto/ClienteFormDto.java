package br.com.clinica.dto;

import java.time.LocalDate;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonAlias;

import br.com.clinica.modelo.SexoCliente;
import br.com.clinica.modelo.TipoPessoaCliente;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteFormDto {
	
	@NotBlank
	private String nome;
	@DecimalMin("9")
	@NotNull
	private Integer numeroCnpjCpf;
	@NotBlank
	private String estado;
	private String bairro;
	private String endereco;
	private Integer numeroEndereco;
	private Integer cep;
	@NotNull
	private Integer celular;
	@PastOrPresent
	private LocalDate dataNascimento;
	@Size(max = 250)
	private String obs;
	@NotNull
	private SexoCliente sexo;
	@NotNull
	private TipoPessoaCliente tipoPessoaCliente;
	
	@JsonAlias("cidade_codigo")
	private Long cidadeCodigo;
}
