package com.oneppd.behavioral.chainofresponsibility;

public class DiretorAprovador extends Aprovador {

	private static final double BASE = 100 * 5;
	
	public DiretorAprovador(Aprovador aprovador) {
		super(aprovador);
	}

	@Override
	public String getRole() {
		return "Diretor";
	}

	@Override
	public boolean isPermitido(double valor) {
		return valor < BASE;
	}

}
