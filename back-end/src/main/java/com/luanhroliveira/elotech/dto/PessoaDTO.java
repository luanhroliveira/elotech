package com.luanhroliveira.elotech.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.luanhroliveira.elotech.entities.Pessoa;
import com.luanhroliveira.elotech.entities.enums.Status;

public class PessoaDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String cpf;
	private String nome;
	
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	private Status status;

	private List<PessoaContatoDTO> contatos = new ArrayList<>();

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

		contatos = entity.getContatos().stream().map(x -> new PessoaContatoDTO(x)).collect(Collectors.toList());
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

	public List<PessoaContatoDTO> getContatos() {
		return contatos;
	}

}
