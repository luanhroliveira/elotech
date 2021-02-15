package com.luanhroliveira.elotech.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

import com.luanhroliveira.elotech.dto.PessoaDTO;

@SpringBootTest
@WebAppConfiguration
public class PessoaControllerTest {

	@Autowired
	private PessoaController controller;

	@Test
	public void findAllTest() {
		controller.findAll();
	}

	@Test
	public void finByIdTest() {
		controller.findById(1L);
	}

	@Test
	public void insertTest() {
		controller.insert(new PessoaDTO());
	}

	@Test
	public void setStatus() {
		controller.setStatus(2L);
	}

	@Test
	public void update() {
		controller.update(1L, new PessoaDTO());
	}

	@Test
	public void delete() {
		controller.delete(1L);
	}
}
