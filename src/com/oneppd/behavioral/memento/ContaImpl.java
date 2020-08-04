package com.oneppd.behavioral.memento;

public class ContaImpl implements Conta {

	private String cliente;

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	@Override
	public void save() {
		System.out.println("saving anywhere..");
	}

	@Override
	public void undo() {}
	
}
