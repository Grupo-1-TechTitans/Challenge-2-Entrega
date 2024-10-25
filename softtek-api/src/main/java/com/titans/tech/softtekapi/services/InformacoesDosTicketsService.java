package com.titans.tech.softtekapi.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.titans.tech.softtekapi.dtos.InformacoesDosTicketsDTO;
import com.titans.tech.softtekapi.models.InformacoesDosTicketsModel;
import com.titans.tech.softtekapi.repositories.InformacoesDosTicketsRepository;

@Service
public class InformacoesDosTicketsService {

    @Autowired
    private InformacoesDosTicketsRepository informacoesDosTicketsRepository;

    public InformacoesDosTicketsDTO salvarInformacoesDosTickets(InformacoesDosTicketsDTO informacoesDosTicketsDTO) {
        InformacoesDosTicketsModel informacoesDosTickets = new InformacoesDosTicketsModel();
        informacoesDosTickets.setDescricao(informacoesDosTicketsDTO.getDescricao());
        informacoesDosTickets.setSolucao(informacoesDosTicketsDTO.getSolucao());
        informacoesDosTickets.setStatus(informacoesDosTicketsDTO.getStatus());
        informacoesDosTickets.setPrioridade(informacoesDosTicketsDTO.getPrioridade());

        informacoesDosTickets = informacoesDosTicketsRepository.save(informacoesDosTickets);
        informacoesDosTicketsDTO.setId(informacoesDosTickets.getId());
        return informacoesDosTicketsDTO;
    }

    public List<InformacoesDosTicketsDTO> listarTodosInformacoesDosTickets() {
        return informacoesDosTicketsRepository.findAll()
                .stream()
                .map(informacoesDosTickets -> {
                    InformacoesDosTicketsDTO informacoesDosTicketsDTO = new InformacoesDosTicketsDTO();
                    informacoesDosTicketsDTO.setId(informacoesDosTickets.getId());
                    informacoesDosTicketsDTO.setDescricao(informacoesDosTickets.getDescricao());
                    informacoesDosTicketsDTO.setSolucao(informacoesDosTickets.getSolucao());
                    informacoesDosTicketsDTO.setStatus(informacoesDosTickets.getStatus());
                    informacoesDosTicketsDTO.setPrioridade(informacoesDosTickets.getPrioridade());
                    return informacoesDosTicketsDTO;
                })
                .collect(Collectors.toList());
    }
    
    public void deletarInformacoesDosTickets(Long id) {
    	informacoesDosTicketsRepository.deleteById(id);
    }
}
