package com.titans.tech.softtekapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.titans.tech.softtekapi.models.CategoriaModel;
import com.titans.tech.softtekapi.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public List<CategoriaModel>listarCategorias(){
		return categoriaRepository.findAll();
	}
	
	public CategoriaModel criarCategoria(CategoriaModel categoria) {
		return categoriaRepository.save(categoria);
	}
	
	public CategoriaModel atualizarCategoria(Long id, CategoriaModel categoria) {
		CategoriaModel categoriaExistente = categoriaRepository.findById(id)
				.orElseThrow(() -> new RuntimeException ("Categoria não encontrada"));
		
		categoriaExistente.setNome(categoria.getNome());
		return categoriaRepository.save(categoriaExistente);
	}
	
	public void deletarCategoria(Long id) {
		CategoriaModel categoria = categoriaRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Categoria não Encontrada"));
		categoriaRepository.delete(categoria);
	}
	
	public List<CategoriaModel>buscarPorNome(String nome){
		return categoriaRepository.findByNomeIgnoreCase(nome);
	}
		
	public List<CategoriaModel> buscarPorNomeContendo(String nome){
		return categoriaRepository.findByNomeContainingIgnoreCase(nome);
	}
	
	public List<CategoriaModel>buscarPorNomePrefixo(String prefixo){
		return categoriaRepository.findByNomeStartingWith(prefixo);
	}
	
	public List<CategoriaModel>buscarPorNomeSufixo(String sufixo){
		return categoriaRepository.findByNomeEndingWith(sufixo);
	}
	
}
