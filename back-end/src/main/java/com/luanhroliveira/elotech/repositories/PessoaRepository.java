package com.luanhroliveira.elotech.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luanhroliveira.elotech.entities.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
	
	List<Pessoa> findAllByOrderByNomeAsc();
	@Override
	Optional<Pessoa> findById(Long id);
	
}
