package br.com.clinica.service;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

	public Page<UsuarioDto> listar(Pageable paginacao) {
		Page<Usuario> listUsuario = usuarioRepository.findAll(paginacao);
		return listUsuario.map(t -> modelMapper.map(t, UsuarioDto.class));
	}

	@Transactional
	public void cadastrar(@Valid UsuarioFormDto usuarioFormDto) {
		Usuario usuario = modelMapper.map(usuarioFormDto, Usuario.class);
		usuarioRepository.save(usuario);
	}
}
