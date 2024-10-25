package com.titans.tech.softtekapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.titans.tech.softtekapi.models.NotificacaoModel;
import com.titans.tech.softtekapi.services.NotificacaoService;

@RestController
@RequestMapping("/api/notificacoes")
public class NotificacaoController {
	
	@Autowired
	private NotificacaoService notificacaoService;
	
	@PostMapping
	public ResponseEntity<Void> criarNotificacao(@RequestBody String mensagem) {
		notificacaoService.criarNotificacao(mensagem);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	@GetMapping
	public ResponseEntity<List<NotificacaoModel>> buscarNotificacoes(){
		List<NotificacaoModel> notificacoes = notificacaoService.buscarNotificacoesNaoLidas();
		return ResponseEntity.ok(notificacoes);
	}
}
