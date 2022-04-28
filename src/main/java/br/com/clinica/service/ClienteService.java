package br.com.clinica.service;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.clinica.dto.ClienteDto;
import br.com.clinica.dto.ClienteFormDto;
import br.com.clinica.modelo.Cliente;
import br.com.clinica.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	private ModelMapper modelMapper = new ModelMapper();
	
	public Page<ClienteDto> listar(Pageable paginacao) {
		Page<Cliente> listCliente = clienteRepository.findAll(paginacao);
		return listCliente.map(t -> modelMapper.map(t, ClienteDto.class));
	}

	@Transactional
	public void cadastrar(@Valid ClienteFormDto clienteFormDto) {
		Cliente cliente = modelMapper.map(clienteFormDto, Cliente.class);
		clienteRepository.save(cliente);
	}
}
