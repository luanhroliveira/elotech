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
	private PessoaService pessoaService;
		
	@Test
	public void findAllTest() {
		pessoaService.findAll();
	}
	
	@Test
	public void findById() {
		PessoaDTO obj = pessoaService.findById(1L);
		
		assertEquals("09033536951", obj.getCpf());
		assertEquals("LUAN HIGOR RIBEIRO DE OLIVEIRA", obj.getNome());
		assertEquals("1998-11-04", String.valueOf(obj.getDataNascimento()));
	}
	
}
