package br.com.clinica.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import br.com.clinica.dto.ClienteDto;
import br.com.clinica.dto.ClienteFormDto;
import br.com.clinica.modelo.Cliente;

@Service
public class ClienteService {

	private List<Cliente> listCadastroCliente = new ArrayList<>();
	private ModelMapper modelMapper = new ModelMapper();
	
	public List<ClienteDto> listar() {
		return listCadastroCliente.stream().map(t -> modelMapper.map(t, ClienteDto.class)).collect(Collectors.toList());
	}

	public void cadastrar(@Valid ClienteFormDto clienteFormDto) {
		Cliente cadastroCliente = modelMapper.map(clienteFormDto, Cliente.class);
		listCadastroCliente.add(cadastroCliente);
	}
}
