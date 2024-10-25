package com.titans.tech.softtekapi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.titans.tech.softtekapi.models.NotificacaoModel;

@Repository
public interface NotificacaoRepository extends JpaRepository<NotificacaoModel, Long> {
	List<NotificacaoModel> findByLidaFalse();
}
