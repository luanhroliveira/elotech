package com.luanhroliveira.elotech.dto;

import java.io.Serializable;
import java.util.Date;

import com.luanhroliveira.elotech.entities.Pessoa;
import com.luanhroliveira.elotech.entities.Status;

public class PessoaDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String cpf;
	private String nome;
	private Date dataNascimento;
	private Status status;

	public PessoaDTO() {

	}

	public PessoaDTO(Long id, String cpf, String nome, Date dataNascimento, Status status) {
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.status = status;
	}

	public PessoaDTO(Pessoa entity) {
		id = entity.getId();
		cpf = entity.getCpf();
		nome = entity.getNome();
		dataNascimento = entity.getDataNascimento();
		status = entity.getStatus();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
