package com.oneppd.sctructural.proxy;

public class ContaImpl implements Conta {

	private double saldo;
	
	@Override
	public void creditar(double valor) {
		this.saldo += valor;
	}

	@Override
	public double getSaldo() {
		return this.saldo;
	}

}
