package com.luanhroliveira.elotech.controllers;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.luanhroliveira.elotech.dto.PessoaDTO;
import com.luanhroliveira.elotech.services.PessoaService;

@RestController
@RequestMapping(value = "/pessoas")
public class PessoaController {

	@Autowired
	private PessoaService service;

	@GetMapping
	public ResponseEntity<List<PessoaDTO>> findAll() {
		List<PessoaDTO> list = service.findAll();

		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Optional<PessoaDTO>> findById(@PathVariable Long id) {
		Optional<PessoaDTO> pessoa = Optional.ofNullable(service.findById(id));

		return ResponseEntity.ok().body(pessoa);
	}

	@PostMapping
	public ResponseEntity<PessoaDTO> insert(@RequestBody PessoaDTO dto) {
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();

		return ResponseEntity.created(uri).body(dto);
	}

	@PutMapping("/{id}/status")
	public ResponseEntity<PessoaDTO> setStatus(@PathVariable Long id){
		PessoaDTO dto = service.setStatus(id);
		
		return ResponseEntity.ok().body(dto);
	}
	
	
}
