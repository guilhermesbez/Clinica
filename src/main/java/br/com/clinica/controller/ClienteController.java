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

import br.com.clinica.dto.ClienteDto;
import br.com.clinica.dto.ClienteFormDto;
import br.com.clinica.service.ClienteService;

@RestController
@RequestMapping("/cadastrocliente")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@GetMapping
	public Page<ClienteDto> listar(Pageable paginacao) {
		return clienteService.listar(paginacao);
	}

	@PostMapping
	public void cadastrar(@RequestBody @Valid ClienteFormDto clienteFormDto) {
		clienteService.cadastrar(clienteFormDto);
	}
}
