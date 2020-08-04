package com.oneppd.behavioral.memento;

public class ContaImplProxy implements Conta {

	Memento memento;
	ContaImpl contaImpl = new ContaImpl();
	
	@Override
	public String getCliente() {
		return contaImpl.getCliente();
	}

	@Override
	public void setCliente(String cliente) {
		contaImpl.setCliente(cliente);
	}

	@Override
	public void save() {
		contaImpl.save();
		this.memento = new Memento(contaImpl.getCliente());
	}

	@Override
	public void undo() {
		this.contaImpl.setCliente(this.memento.getState());
	}

}
