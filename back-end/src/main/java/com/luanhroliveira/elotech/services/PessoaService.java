package com.luanhroliveira.elotech.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AuthorizationServiceException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luanhroliveira.elotech.dto.PessoaContatoDTO;
import com.luanhroliveira.elotech.dto.PessoaDTO;
import com.luanhroliveira.elotech.entities.Pessoa;
import com.luanhroliveira.elotech.entities.PessoaContato;
import com.luanhroliveira.elotech.entities.enums.Status;
import com.luanhroliveira.elotech.repositories.PessoaContatoRepository;
import com.luanhroliveira.elotech.repositories.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository repository;

	@Autowired
	private PessoaContatoRepository contatoRepository;

	@Transactional(readOnly = true)
	public List<PessoaDTO> findAll() {
		List<Pessoa> list = repository.findAllByOrderByNomeAsc();
		return list.stream().map(x -> new PessoaDTO(x)).collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public PessoaDTO findById(Long id) {
		Optional<Pessoa> pessoa = repository.findById(id);

		return pessoa.map(x -> new PessoaDTO(x)).get();
	}

	@Transactional
	public PessoaDTO insert(PessoaDTO dto) {

		if (dto.getContatos().size() == 0) {
			throw new AuthorizationServiceException("Adicione no mínimo 1(um) contato para essa pessoa.");
		}

		Pessoa pessoa = new Pessoa(null, dto.getNome(), dto.getCpf(), dto.getDataNascimento(), Status.ATIVO);

		for (PessoaContatoDTO p : dto.getContatos()) {
			PessoaContato contato = new PessoaContato(null, pessoa, p.getTelefone(), p.getEmail(), Status.ATIVO);
			pessoa.getContatos().add(contato);
		}

		pessoa = repository.save(pessoa);
		contatoRepository.saveAll(pessoa.getContatos());

		return new PessoaDTO(pessoa);
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}

	@Transactional
	public PessoaDTO setStatus(Long id) {

		Pessoa pessoa = repository.getOne(id);
		String status = pessoa.getStatus().toString();

		pessoa.setStatus((status == "ATIVO") ? Status.INATIVO : Status.ATIVO);
		pessoa = repository.save(pessoa);

		return new PessoaDTO(pessoa);
	}

}
