package com.titans.tech.softtekapi.dtos;

import java.time.LocalDateTime;

import com.titans.tech.softtekapi.enums.EnumCategoria;
import com.titans.tech.softtekapi.enums.EnumPrioridade;
import com.titans.tech.softtekapi.enums.EnumStatusTicket;

public class TicketDTO {

	private Long id;
	private String nome;
	private String descricao;
	private EnumCategoria categoria;
	private EnumStatusTicket status;
	private EnumPrioridade prioridade;
	private LocalDateTime dataCriacao;
	private LocalDateTime dataResolvido;

	public TicketDTO() {
	}

	public TicketDTO(Long id, String nome, String descricao, EnumCategoria categoria, LocalDateTime dataCriacao,
			LocalDateTime dataResolvido, EnumStatusTicket status, EnumPrioridade prioridade) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.categoria = categoria;
		this.dataCriacao = dataCriacao;
		this.dataResolvido = dataResolvido;
		this.status = status;
		this.prioridade = prioridade;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public EnumCategoria getCategoria() {
		return categoria;
	}

	public void setCategoria(EnumCategoria categoria) {
		this.categoria = categoria;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public LocalDateTime getDataResolvido() {
		return dataResolvido;
	}

	public void setDataResolvido(LocalDateTime dataResolvido) {
		this.dataResolvido = dataResolvido;
	}

	public EnumStatusTicket getStatus() {
		return status;
	}

	public void setStatus(EnumStatusTicket status) {
		this.status = status;
	}

	public EnumPrioridade getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(EnumPrioridade prioridade) {
		this.prioridade = prioridade;
	}

}
