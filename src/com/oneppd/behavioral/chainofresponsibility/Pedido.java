package com.oneppd.behavioral.chainofresponsibility;

public class Pedido {
	
	private double valor;
	
	private String proposito;

	public Pedido(double valor, String proposito) {
		super();
		this.valor = valor;
		this.proposito = proposito;
	}

	public double getValor() {
		return valor;
	}

	public String getProposito() {
		return proposito;
	}
	
}
