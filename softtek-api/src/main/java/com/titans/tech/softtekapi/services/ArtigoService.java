package com.titans.tech.softtekapi.services;

import java.time.LocalDateTime;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.titans.tech.softtekapi.models.ArtigoModel;
import com.titans.tech.softtekapi.repositories.ArtigoRepository;

@Service
public class ArtigoService {

	@Autowired
	private ArtigoRepository artigoRepository;
	
	public List<ArtigoModel> listarArtigos() {
		return artigoRepository.findAll();
	}
	
	public ArtigoModel criarArtigo(ArtigoModel artigo) {
		artigo.setDataCriacao(LocalDateTime.now());
		return artigoRepository.save(artigo);
	}
	
	public ArtigoModel atualizarArtigo(Long id, ArtigoModel artigo) {
		ArtigoModel artigoExistente = artigoRepository.findById(id)
					  .orElseThrow(() -> new RuntimeException ("Artigo não encontrado"));
		artigoExistente.setTitulo(artigo.getTitulo());
		artigoExistente.setConteudo(artigo.getConteudo());
		artigoExistente.setAutor(artigo.getAutor());
		return artigoRepository.save(artigoExistente);
	}
		
	public void deletarArtigo(Long id) {
		artigoRepository.deleteById(id);
		
	}
		
}
