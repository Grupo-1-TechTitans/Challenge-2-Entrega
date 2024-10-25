package com.titans.tech.softtekapi.enums;

public enum EnumPrioridade {

	BAIXA(0), MEDIA(1), ALTA(2);

	private int id;

	EnumPrioridade(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
