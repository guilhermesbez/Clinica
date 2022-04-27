package br.com.clinica.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
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
	
	public List<ClienteDto> listar() {
		List<Cliente> listCliente = clienteRepository.findAll();
		return listCliente.stream().map(t -> modelMapper.map(t, ClienteDto.class)).collect(Collectors.toList());
	}

	public void cadastrar(@Valid ClienteFormDto clienteFormDto) {
		Cliente cliente = modelMapper.map(clienteFormDto, Cliente.class);
		
		clienteRepository.save(cliente);
	}
}
