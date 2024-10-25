package com.titans.tech.softtekapi.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.titans.tech.softtekapi.models.NotificacaoModel;
import com.titans.tech.softtekapi.repositories.NotificacaoRepository;

@Service
public class NotificacaoService {
	
	@Autowired
	private NotificacaoRepository notificacaoRepository;
	
	public void criarNotificacao(String mensagem) {
		NotificacaoModel notificacao = new NotificacaoModel();
		notificacao.setMensagem(mensagem);
		notificacao.setDataCriacao(LocalDateTime.now());
		notificacao.setLida(false);
		notificacaoRepository.save(notificacao);
	
	}
		public List<NotificacaoModel> buscarNotificacoesNaoLidas(){
			return notificacaoRepository.findByLidaFalse();
		
	}

}
