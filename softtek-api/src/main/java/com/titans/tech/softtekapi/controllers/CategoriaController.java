package com.titans.tech.softtekapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.titans.tech.softtekapi.models.CategoriaModel;
import com.titans.tech.softtekapi.services.CategoriaService;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {

	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping
	public ResponseEntity<List<CategoriaModel>> listarCategorias(){
		List<CategoriaModel> categorias = categoriaService.listarCategorias();
		return ResponseEntity.ok(categorias);
	}
	
	@PostMapping
	public  ResponseEntity<CategoriaModel>criarCategoria(@RequestBody CategoriaModel categoria) {
		CategoriaModel novaCategoria = categoriaService.criarCategoria(categoria);
		return ResponseEntity.status(201).body(novaCategoria);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<CategoriaModel>atualizarCategoria(@PathVariable Long id, @RequestBody CategoriaModel categoria){
		CategoriaModel categoriaAtualizada = categoriaService.atualizarCategoria(id, categoria);
		return ResponseEntity.ok(categoriaAtualizada);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletarCategoria(@PathVariable Long id){
		categoriaService.deletarCategoria(id);
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping("/buscar")
	public ResponseEntity<List<CategoriaModel>>buscarPorNome(@RequestParam String nome){
		List<CategoriaModel> categorias = categoriaService.buscarPorNome(nome);
		return ResponseEntity.ok(categorias);
	}
	
	@GetMapping("/buscar/contem")
	public ResponseEntity<List<CategoriaModel>>buscarPorNomeContendo(@RequestParam String nome){
		List<CategoriaModel> categorias = categoriaService.buscarPorNomeContendo(nome);
		return ResponseEntity.ok(categorias);
	}
	
	@GetMapping("/buscar/prefixo")
	public ResponseEntity<List<CategoriaModel>>buscarPorNomePrefixo(@RequestParam String prefixo){
		List<CategoriaModel> categorias = categoriaService.buscarPorNomePrefixo(prefixo);
		return ResponseEntity.ok(categorias);
	}
		
	@GetMapping("/buscar/sufixo")
	public ResponseEntity<List<CategoriaModel>>buscarPorNomeSufixo(@RequestParam String sufixo){
		List<CategoriaModel> categorias = categoriaService.buscarPorNomeSufixo(sufixo);
		return ResponseEntity.ok(categorias);
	}
	
}
