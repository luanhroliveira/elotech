package com.luanhroliveira.elotech.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

import com.luanhroliveira.elotech.dto.PessoaDTO;

@SpringBootTest
@WebAppConfiguration
public class PessoaServiceTest {

	@Autowired
	private PessoaService service;

	@Test
	public void findAllTest() {
		service.findAll();
	}

	@Test
	public void findByIdTest() {
		PessoaDTO obj = service.findById(1L);

		assertEquals("09033536951", obj.getCpf());
		assertEquals("LUAN HIGOR RIBEIRO DE OLIVEIRA", obj.getNome());
		assertEquals("1998-11-04", String.valueOf(obj.getDataNascimento()));
	}

	@Test
	public void setStatusTest() {
		service.setStatus(1L);
	}

	@Test
	public void updateTest() {
		service.update(1L, new PessoaDTO());
	}

	@Test
	public void deleteTest() {
		service.delete(1L);
	}
}
