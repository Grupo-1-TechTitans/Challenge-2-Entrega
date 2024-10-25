package com.titans.tech.softtekapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.titans.tech.softtekapi.dtos.InformacoesDosTicketsDTO;
import com.titans.tech.softtekapi.services.InformacoesDosTicketsService;

@RestController
@RequestMapping("/informacoes-dos-tickets")
public class InformacoesDosTicketsController {

    @Autowired
    private InformacoesDosTicketsService informacoesDosTicketsService;


    @PostMapping
    public InformacoesDosTicketsDTO criarInformacoesDosTickets(@RequestBody InformacoesDosTicketsDTO informacoesDosTicketsDTO) {
        return informacoesDosTicketsService.salvarInformacoesDosTickets(informacoesDosTicketsDTO);
    }


    @GetMapping
    public List<InformacoesDosTicketsDTO> listarTodasInformacoesDosTickets() {
        return informacoesDosTicketsService.listarTodosInformacoesDosTickets();
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void>deletarInformaçõesDosTickets(@PathVariable Long id){
    	informacoesDosTicketsService.deletarInformacoesDosTickets(id);
    	return ResponseEntity.noContent().build();
    }

}

