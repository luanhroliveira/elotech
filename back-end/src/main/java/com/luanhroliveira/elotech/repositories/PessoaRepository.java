package com.luanhroliveira.elotech.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luanhroliveira.elotech.entities.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
	
	List<Pessoa> findAllByOrderByNomeAsc();
}
