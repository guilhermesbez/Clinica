package br.com.clinica.service;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

	public Page<CidadeDto> listar(Pageable paginacao) {
		Page<Cidade> listCidade = cidadeRepository.findAll(paginacao);
		return listCidade.map(t -> modelMapper.map(t, CidadeDto.class));
	}

	@Transactional
	public void cadastrar(@Valid CidadeFormDto cidadeFormDto) {
		Cidade cidade = modelMapper.map(cidadeFormDto, Cidade.class);
		cidadeRepository.save(cidade);		
	}

}
