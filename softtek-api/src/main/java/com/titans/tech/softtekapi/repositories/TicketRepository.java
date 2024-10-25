package com.titans.tech.softtekapi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.titans.tech.softtekapi.enums.EnumStatusTicket;
import com.titans.tech.softtekapi.models.TicketModel;

@Repository
public interface TicketRepository extends JpaRepository<TicketModel, Long> {
	List<TicketModel>findByStatus(EnumStatusTicket status);
}
