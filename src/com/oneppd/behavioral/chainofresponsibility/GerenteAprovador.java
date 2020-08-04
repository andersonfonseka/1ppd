package com.oneppd.behavioral.chainofresponsibility;

public class GerenteAprovador extends Aprovador {

	private static final double BASE = 100 * 2;
	
	public GerenteAprovador(Aprovador aprovador) {
		super(aprovador);
	}

	@Override
	public String getRole() {
		return "Gerente";
	}

	@Override
	public boolean isPermitido(double valor) {
		return valor < BASE;
	}

}
