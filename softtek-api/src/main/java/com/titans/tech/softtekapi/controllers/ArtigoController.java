package com.titans.tech.softtekapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.titans.tech.softtekapi.models.ArtigoModel;
import com.titans.tech.softtekapi.services.ArtigoService;

@RestController
@RequestMapping("/api/artigos")
public class ArtigoController {

	@Autowired
	private ArtigoService artigoService;
	
	@GetMapping
	public ResponseEntity<List<ArtigoModel>> listarArtigos(){
		return ResponseEntity.ok(artigoService.listarArtigos());
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<ArtigoModel> atualizarArtigo(@PathVariable Long id, @RequestBody ArtigoModel artigo){
		return ResponseEntity.ok(artigoService.atualizarArtigo (id, artigo));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletarArtigo(@PathVariable Long id) {
		artigoService.deletarArtigo(id);
		return ResponseEntity.noContent().build();
	}
}
