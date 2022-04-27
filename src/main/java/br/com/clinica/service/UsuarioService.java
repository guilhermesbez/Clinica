package br.com.clinica.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.clinica.dto.UsuarioDto;
import br.com.clinica.dto.UsuarioFormDto;
import br.com.clinica.modelo.Usuario;
import br.com.clinica.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	private ModelMapper modelMapper = new ModelMapper();

	public List<UsuarioDto> listar() {
		List<Usuario> listUsuario = usuarioRepository.findAll();
		return listUsuario.stream().map(t -> modelMapper.map(t, UsuarioDto.class)).collect(Collectors.toList());
	}

	public void cadastrar(@Valid UsuarioFormDto usuarioFormDto) {
		Usuario usuario = modelMapper.map(usuarioFormDto, Usuario.class);
		
		usuarioRepository.save(usuario);
	}
}
