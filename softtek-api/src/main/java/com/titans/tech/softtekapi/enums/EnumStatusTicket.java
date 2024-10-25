package com.titans.tech.softtekapi.enums;

public enum EnumStatusTicket {
	
	ABERTO(0),
	EM_EXECUCAO(1),
	RESOLVIDO(2);
	
	private int id;
	
	EnumStatusTicket(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
