package com.luanhroliveira.elotech.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luanhroliveira.elotech.dto.PessoaDTO;
import com.luanhroliveira.elotech.entities.Pessoa;
import com.luanhroliveira.elotech.repositories.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository repository;

	@Transactional(readOnly = true)
	public List<PessoaDTO> findAll() {
		List<Pessoa> list = repository.findAllByOrderByNomeAsc();
		return list.stream().map(x -> new PessoaDTO(x)).collect(Collectors.toList());
	}

}
