package br.com.clinica.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
	public Page<UsuarioDto> listar(Pageable paginacao) {
		return usuarioService.listar(paginacao);
	}
	
	@PostMapping
	public void cadastrar(@RequestBody @Valid UsuarioFormDto usuarioFormDto) {
		usuarioService.cadastrar(usuarioFormDto);
	}	
}
