package com.titans.tech.softtekapi.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.titans.tech.softtekapi.models.CredencialUsuarioModel;
import com.titans.tech.softtekapi.repositories.CredencialUsuarioRepository;

@Service
public class CredencialUsuarioService {
	
	@Autowired
	private CredencialUsuarioRepository credencialUsuarioRepository;
	
	public CredencialUsuarioModel criarCredencial(CredencialUsuarioModel credencial) {
		return credencialUsuarioRepository.save(credencial);
	}
	
	public Optional<CredencialUsuarioModel>buscarPorEmail(String email){
		return credencialUsuarioRepository.findByEmail(email);
	}
	
	public boolean emailJaExistente(String email) {
		return credencialUsuarioRepository.existsByEmail(email);
	}
	
	public Optional<CredencialUsuarioModel>autenticar(String email, String senha){
		return credencialUsuarioRepository.findByEmailAndSenha(email, senha);
	}
	
	public void atualizarSenha(String email, String novaSenha) {
		credencialUsuarioRepository.updateSenhaByEmail(novaSenha, email);
	}
	
	public void deletarCredencialPorEmail(String email) {
		credencialUsuarioRepository.deleteByEmail(email);
	}
	
}
