package com.titans.tech.softtekapi.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/acesso")
public class ControleDeAcessoController {
	@PostMapping(value = "logar")
	public ResponseEntity<?> logar() {
		return ResponseEntity.ok().body("Login");
	}
	
	@PostMapping(value = "cadastrar")
	public ResponseEntity<?> cadastrar() {
		return ResponseEntity.ok().body("Cadastro");
	}
	
	@PostMapping(value = "deslogar")
	public ResponseEntity<?> deslogar() {
		return ResponseEntity.ok().body("Logout");
	}
}
