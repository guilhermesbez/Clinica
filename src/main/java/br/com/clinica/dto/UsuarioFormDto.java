package br.com.clinica.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioFormDto {
	
	@NotBlank
	private String nome;
	@NotBlank
	private String login;
	@NotBlank
	@Size(min = 6, max = 15)
	private String senha;
}
