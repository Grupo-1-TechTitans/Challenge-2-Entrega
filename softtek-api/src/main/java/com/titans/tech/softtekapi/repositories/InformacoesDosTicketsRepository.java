package com.titans.tech.softtekapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.titans.tech.softtekapi.models.InformacoesDosTicketsModel;

@Repository
public interface InformacoesDosTicketsRepository extends JpaRepository<InformacoesDosTicketsModel, Long> {
}
