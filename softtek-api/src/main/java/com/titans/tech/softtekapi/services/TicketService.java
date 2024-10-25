package com.titans.tech.softtekapi.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.titans.tech.softtekapi.dtos.TicketDTO;
import com.titans.tech.softtekapi.enums.EnumStatusTicket;
import com.titans.tech.softtekapi.models.TicketModel;
import com.titans.tech.softtekapi.repositories.TicketRepository;

@Service
public class TicketService {
	
	@Autowired
	private TicketRepository ticketRepository;
	@Autowired
	private ModelMapper modelMapper;
	
	public void criarTicket(TicketDTO ticket) {
		
		TicketModel tickeModel = modelMapper.map(ticket, TicketModel.class);
		
		tickeModel.setDataCriacao(LocalDateTime.now());
		tickeModel.setStatus(EnumStatusTicket.EM_EXECUCAO);
		ticketRepository.save(tickeModel);
	}
	
	public List<TicketDTO> buscarTodos() {
		
		return ticketRepository.findAll()
				.stream()
				.map(ticket -> modelMapper.map(ticket, TicketDTO.class))
				.toList();
	}
	
	public TicketDTO buscarPorId(Long id) {
		TicketModel model = ticketRepository.findById(id).get();
		TicketDTO response = modelMapper.map(model, TicketDTO.class);
		
		return response;
	}
	

	
	public TicketModel atualizarTicket(Long id, TicketModel ticketAtualizado) {
		Optional<TicketModel> ticketExistente = ticketRepository.findById(id);
		
		if(ticketExistente.isPresent()) {
			TicketModel ticket = ticketExistente.get();
			ticket.setNome(ticketAtualizado.getNome());
			ticket.setDescricao(ticketAtualizado.getDescricao());
			ticket.setStatus(ticketAtualizado.getStatus());
			return ticketRepository.save(ticket);
		} else {
			throw new RuntimeException("Ticket não encontrado");
		}
	}
	
	public void deletarTicket(Long id) {
		ticketRepository.deleteById(id);
	}
	
	public TicketModel atualizarStatus(Long id, EnumStatusTicket novoStatus) {
		Optional<TicketModel> ticketExistente = ticketRepository.findById(id);
		
		if(ticketExistente.isPresent()) {
			TicketModel ticket = ticketExistente.get();
			ticket.setStatus(novoStatus);
			return ticketRepository.save(ticket);
		} else {
			throw new RuntimeException("Ticket não encontrado");
		}
	}
}

