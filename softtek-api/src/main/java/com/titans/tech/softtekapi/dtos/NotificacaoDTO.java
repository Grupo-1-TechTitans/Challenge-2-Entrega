package com.titans.tech.softtekapi.dtos;

import java.time.LocalDateTime;

public class NotificacaoDTO {
	
	private Long id;
	private String mensagem;
	private LocalDateTime dataCriacao;
	private boolean lida;
	
	public NotificacaoDTO() {}
	
	public NotificacaoDTO(Long id, String mensagem, LocalDateTime dataCriacao, boolean lida) {
		this.id = id;
		this.mensagem = mensagem;
		this.dataCriacao = dataCriacao;
		this.lida = lida;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public boolean isLida() {
		return lida;
	}

	public void setLida(boolean lida) {
		this.lida = lida;
	}

}
