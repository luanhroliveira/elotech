package com.luanhroliveira.elotech.dto;

import java.io.Serializable;

import com.luanhroliveira.elotech.entities.Pessoa;
import com.luanhroliveira.elotech.entities.PessoaContato;
import com.luanhroliveira.elotech.entities.enums.Status;

public class PessoaContatoDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	private Pessoa pessoa;
	private String telefone;
	private String email;
	private Status status;

	public PessoaContatoDTO() {

	}

	public PessoaContatoDTO(Long id, String nome, Pessoa pessoa, String telefone, String email, Status status) {
		this.id = id;
		this.nome = nome;
		this.pessoa = pessoa;
		this.telefone = telefone;
		this.email = email;
		this.status = status;
	}

	public PessoaContatoDTO(PessoaContato entity) {
		id = entity.getId();
		nome = entity.getNome();
		telefone = entity.getTelefone();
		email = entity.getEmail();
		status = entity.getStatus();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
