package com.oneppd.behavioral.chainofresponsibility;

public class VPAprovador extends Aprovador {

	private static final double BASE = 100 * 10;
	
	public VPAprovador(Aprovador aprovador) {
		super(aprovador);
	}

	@Override
	public String getRole() {
		return "VP";
	}

	@Override
	public boolean isPermitido(double valor) {
		return valor < BASE;
	}

}
