package br.com.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.clinica.modelo.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{
	
}
