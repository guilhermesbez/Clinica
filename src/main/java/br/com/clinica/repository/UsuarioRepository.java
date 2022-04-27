package br.com.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.clinica.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
}
