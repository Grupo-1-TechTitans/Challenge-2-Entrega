package com.titans.tech.softtekapi.repositories;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.titans.tech.softtekapi.models.ArtigoModel;

public interface ArtigoRepository extends JpaRepository<ArtigoModel, Long> {

	List<ArtigoModel> findByTitulo (String titulo);
	
	List<ArtigoModel> findByAutor (String autor);
	
	List<ArtigoModel> findByDataCriacaoAfter(LocalDateTime data);
	
	long countByAutor(String autor);
	
	@Query("SELECT a FROM ArtigoModel a WHERE a.titulo LIKE %:palavraChaves% OR a.conteudo LIKE %:palavraChave%")
	List<ArtigoModel> buscarArtigosPorPalavraChave(@Param("palavraChave") String palavraChave);
	
}
