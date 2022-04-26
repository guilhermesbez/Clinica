package br.com.clinica.modelo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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
@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long codigo;
	private String nome;
	private Integer numeroCnpjCpf;
	private String estado;
	private String bairro;
	private String endereco;
	private Integer numeroEndereco;
	private Integer cep;
	private Integer cel;
	private LocalDate dataNascimento;
	private String obs;
	
		
	private SexoCliente sexo;
	@Enumerated(EnumType.STRING)
	private TipoPessoaCliente tipoPessoaCliente;
	
	@ManyToOne
	private Cidade cidade;
	
}
