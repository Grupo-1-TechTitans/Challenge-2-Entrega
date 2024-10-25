package com.titans.tech.softtekapi.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.titans.tech.softtekapi.models.CredencialUsuarioModel;



@Repository
public interface CredencialUsuarioRepository extends JpaRepository<CredencialUsuarioModel, Long> {

	Optional<CredencialUsuarioModel>findByEmail(String email);
	
	boolean existsByEmail(String email);
	
	Optional<CredencialUsuarioModel>findById(Long id);
	
	Optional<CredencialUsuarioModel>findByEmailAndSenha(String email, String senha);
	
	void deleteByEmail(String email);
	
	List<CredencialUsuarioModel> findAll();
	
	 @Modifying
	 @Query("UPDATE CredencialUsuarioModel c SET c.senha = ?1 WHERE c.email = ?2")
	 void updateSenhaByEmail(String novaSenha, String email);
}
