package br.com.clinica.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CidadeFormDto {
	
	@NotNull
	private Integer codigoIbge;
	@NotBlank
	private String nomeCidade;
}
