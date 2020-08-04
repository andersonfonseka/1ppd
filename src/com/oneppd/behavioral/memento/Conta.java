package com.oneppd.behavioral.memento;

public interface Conta {
	
	public String getCliente();

	public void setCliente(String cliente);

	public void save();
	
	public void undo();
	
}
