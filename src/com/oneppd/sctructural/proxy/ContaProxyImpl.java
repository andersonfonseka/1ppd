package com.oneppd.sctructural.proxy;

public class ContaProxyImpl implements Conta {

	private Conta conta;
	
	public ContaProxyImpl() {
		this.conta = new ContaImpl();
	}
	
	@Override
	public void creditar(double valor) {
		conta.creditar(valor);
	}

	@Override
	public double getSaldo() {
		return calcularCPMF();
	}
	
	private double calcularCPMF() {
		double valor = conta.getSaldo() - (conta.getSaldo() * 0.025);
		return valor;
	}

}
