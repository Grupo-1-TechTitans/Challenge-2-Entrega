package com.titans.tech.softtekapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.titans.tech.softtekapi.dtos.TicketDTO;
import com.titans.tech.softtekapi.services.TicketService;

@RestController
@RequestMapping("ticket")
public class TicketController {

	@Autowired
	private TicketService ticketService;
	
	@GetMapping()
	public ResponseEntity<List<TicketDTO>> getTickets() {
		return ResponseEntity.ok().body(ticketService.buscarTodos());
	}

	@GetMapping("/{id}")
	public ResponseEntity<TicketDTO> getTicketById(@PathVariable Long id) {
		return ResponseEntity.ok().body(ticketService.buscarPorId(id));
	}

	@PostMapping()
	public void criarTicket(@RequestBody TicketDTO ticket) {
		ticketService.criarTicket(ticket);
	}

	@PutMapping("/{id}")
	public void atualizarTicket(@PathVariable Long id, @RequestBody TicketDTO ticket) {
		
	}

	@DeleteMapping("/{id}")
	public void deletarTicket(@PathVariable Long id) {
		ticketService.deletarTicket(id);
	}

}
