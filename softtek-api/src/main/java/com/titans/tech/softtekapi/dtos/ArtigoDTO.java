package com.titans.tech.softtekapi.dtos;

import java.time.LocalDateTime;

public class ArtigoDTO {

	private Long id;
	private String titulo;
	private String conteudo;
	private String autor;
	private LocalDateTime dataCriacao;

	public ArtigoDTO() {
	}

	public ArtigoDTO(Long id, String titulo, String conteudo, String autor, LocalDateTime dataCriacao) {
		this.id = id;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.autor = autor;
		this.dataCriacao = dataCriacao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

}
