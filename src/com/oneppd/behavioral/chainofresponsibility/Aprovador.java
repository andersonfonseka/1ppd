package com.oneppd.behavioral.chainofresponsibility;

public abstract class Aprovador {
	
	private Aprovador aprovador;
	
	public abstract String getRole();
	
	public abstract boolean isPermitido(double valor);
	
	public Aprovador(Aprovador aprovador) {
		super();
		this.aprovador = aprovador;
	}

	public Aprovador getAprovador() {
		return aprovador;
	}

	public void processRequest(Pedido pedido){
		if(this.isPermitido(pedido.getValor())){
			System.out.println(getRole() + " tem permissao para a aprovacao do pedido de " + pedido.getValor() + " para " + pedido.getProposito());
		} else {
			this.aprovador.processRequest(pedido);
		}
	}

}
