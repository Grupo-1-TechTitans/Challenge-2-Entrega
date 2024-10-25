package com.titans.tech.softtekapi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.titans.tech.softtekapi.models.CategoriaModel;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long> {

	List<CategoriaModel>findByNomeIgnoreCase(String nome);
	
	List<CategoriaModel>findByNomeContainingIgnoreCase(String nome);
	
	List<CategoriaModel>findByNomeStartingWith(String nome);
	
	List<CategoriaModel>findByNomeEndingWith(String sufixo);
	
}
