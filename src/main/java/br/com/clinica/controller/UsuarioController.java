package br.com.clinica.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.clinica.dto.UsuarioDto;
import br.com.clinica.dto.UsuarioFormDto;
import br.com.clinica.service.UsuarioService;

@RestController
@RequestMapping("/cadastrousuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping
	public List<UsuarioDto> listar() {
		return usuarioService.listar();
	}
	
	@PostMapping
	public void cadastrar(@RequestBody @Valid UsuarioFormDto usuarioFormDto) {
		usuarioService.cadastrar(usuarioFormDto);
	}	
}
