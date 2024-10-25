package com.titans.tech.softtekapi.models;

import java.time.LocalDateTime;

import com.titans.tech.softtekapi.enums.EnumCategoria;
import com.titans.tech.softtekapi.enums.EnumPrioridade;
import com.titans.tech.softtekapi.enums.EnumStatusTicket;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_ticket")
public class TicketModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "categoria")
	private EnumCategoria categoria;
	
	@Column(name = "data_criacao")
	private LocalDateTime dataCriacao;
	
	@Column(name = "data_resolvido")
	private LocalDateTime dataResolvido;
	
	@Column(name = "status")
	private EnumStatusTicket status;
	
	@Column(name = "prioridade")
	private EnumPrioridade prioridade;
	
	public TicketModel() {
	}
	
	public TicketModel(Long id, String nome, String descricao, EnumCategoria categoria, LocalDateTime dataCriacao,
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
