package com.oneppd.behavioral.memento;

public class Memento {

	private final String cliente;

	public Memento(final String cliente) {
		super();
		this.cliente = cliente;
	}

	public String getState() {
		return this.cliente;
	}
	
}
