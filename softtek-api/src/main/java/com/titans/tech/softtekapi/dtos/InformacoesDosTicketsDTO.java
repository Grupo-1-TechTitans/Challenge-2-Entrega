package com.titans.tech.softtekapi.dtos;

import com.titans.tech.softtekapi.models.InformacoesDosTicketsModel;

public class InformacoesDosTicketsDTO {

    private Long id;
    private String descricao;
    private String solucao;
    private String status;
    private String prioridade;

    public InformacoesDosTicketsDTO() {}


    public InformacoesDosTicketsDTO(Long id, String descricao, String solucao, String status, String prioridade) {
        this.id = id;
        this.descricao = descricao;
        this.solucao = solucao;
        this.status = status;
        this.prioridade = prioridade;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSolucao() {
        return solucao;
    }

    public void setSolucao(String solucao) {
        this.solucao = solucao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }


    public InformacoesDosTicketsModel toModel() {
        InformacoesDosTicketsModel model = new InformacoesDosTicketsModel();
        model.setId(this.id);
        model.setDescricao(this.descricao);
        model.setSolucao(this.solucao);
        model.setStatus(this.status);
        model.setPrioridade(this.prioridade);
        return model;
    }


    public static InformacoesDosTicketsDTO fromModel(InformacoesDosTicketsModel model) {
        return new InformacoesDosTicketsDTO(
            model.getId(),
            model.getDescricao(),
            model.getSolucao(),
            model.getStatus(),
            model.getPrioridade()
        );
    }
}


