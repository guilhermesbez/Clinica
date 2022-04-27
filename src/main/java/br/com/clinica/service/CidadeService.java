package br.com.clinica.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.clinica.dto.CidadeDto;
import br.com.clinica.dto.CidadeFormDto;
import br.com.clinica.modelo.Cidade;
import br.com.clinica.repository.CidadeRepository;

@Service
public class CidadeService {
	
	@Autowired
	private CidadeRepository cidadeRepository;
	private ModelMapper modelMapper = new ModelMapper();

	public List<CidadeDto> listar() {
		List<Cidade> listCidade = cidadeRepository.findAll();
		return listCidade.stream().map(t -> modelMapper.map(t, CidadeDto.class)).collect(Collectors.toList());
	}

	public void cadastrar(@Valid CidadeFormDto cidadeFormDto) {
		Cidade cidade = modelMapper.map(cidadeFormDto, Cidade.class);
		
		cidadeRepository.save(cidade);		
	}

}
