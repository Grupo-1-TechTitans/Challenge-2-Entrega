package com.titans.tech.softtekapi.models;

public class UserMessageModel {

	private String message;
	
	public UserMessageModel(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
