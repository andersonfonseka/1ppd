package com.oneppd.behavioral.chainofresponsibility;

public class PresidenteAprovador extends Aprovador {
	
	public PresidenteAprovador(Aprovador aprovador) {
		super(aprovador);
	}

	@Override
	public String getRole() {
		return "Presidente";
	}

	@Override
	public boolean isPermitido(double valor) {
		return true;
	}

}
