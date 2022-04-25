package br.com.clinica.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import br.com.clinica.dto.UsuarioDto;
import br.com.clinica.dto.UsuarioFormDto;
import br.com.clinica.modelo.Usuario;

@Service
public class UsuarioService {

	private List<Usuario> listCadastroUsuario = new ArrayList<>();
	private ModelMapper modelMapper = new ModelMapper();

	public List<UsuarioDto> listar() {
		return listCadastroUsuario.stream().map(t -> modelMapper.map(t, UsuarioDto.class)).collect(Collectors.toList());
	}

	public void cadastrar(@Valid UsuarioFormDto usuarioFormDto) {
		Usuario cadastroUsuario = modelMapper.map(usuarioFormDto, Usuario.class);
		listCadastroUsuario.add(cadastroUsuario);
	}
}
