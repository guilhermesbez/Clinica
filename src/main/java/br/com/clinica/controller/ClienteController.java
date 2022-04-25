package br.com.clinica.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.clinica.dto.ClienteDto;
import br.com.clinica.dto.ClienteFormDto;
import br.com.clinica.service.ClienteService;

@RestController
@RequestMapping("/cadastrocliente")
public class ClienteController {

	@Autowired
	ClienteService clienteService;

	@GetMapping
	public List<ClienteDto> listar() {
		return clienteService.listar();
	}

	@PostMapping
	public void cadastrar(@RequestBody @Valid ClienteFormDto clienteFormDto) {
		clienteService.cadastrar(clienteFormDto);
	}
}
