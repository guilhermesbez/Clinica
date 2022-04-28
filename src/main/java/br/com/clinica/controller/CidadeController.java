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

import br.com.clinica.dto.CidadeDto;
import br.com.clinica.dto.CidadeFormDto;
import br.com.clinica.service.CidadeService;

@RestController
@RequestMapping("/cadastrocidade")
public class CidadeController {
	
	@Autowired
	private CidadeService cidadeService;
	
	@GetMapping
	public Page<CidadeDto> listar(Pageable paginacao) {
		return cidadeService.listar(paginacao);
	}
	
	@PostMapping
	public void cadastrar(@RequestBody @Valid CidadeFormDto cidadeFormDto) {
		cidadeService.cadastrar(cidadeFormDto);
	}
}
