package com.titans.tech.softtekapi.enums;

public enum EnumCategoria {

	ABERTO(0, "Aberto"),
	EM_EXECUCAO(1, "Em Execução"),
	RESOLVIDO(2, "Resolvido");
	
	private int id;
	private String label;
	
	EnumCategoria(int id, String label) {
		this.id = id;
		this.label = label;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}
