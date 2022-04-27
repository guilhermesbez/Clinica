package br.com.clinica.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.clinica.dto.CidadeDto;
import br.com.clinica.dto.CidadeFormDto;
import br.com.clinica.service.CidadeService;

@RestController
@RequestMapping("/cadastrocidade")
public class CidadeController {
	
	@Autowired
	private CidadeService cidadeService;
	
	@GetMapping
	public List<CidadeDto> listar() {
		return cidadeService.listar();
	}
	
	@PostMapping
	public void cadastrar(@RequestBody @Valid CidadeFormDto cidadeFormDto) {
		cidadeService.cadastrar(cidadeFormDto);
	}
}
