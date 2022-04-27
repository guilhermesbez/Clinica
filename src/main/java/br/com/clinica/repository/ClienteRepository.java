package br.com.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.clinica.modelo.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
}
