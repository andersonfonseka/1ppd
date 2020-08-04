package com.oneppd.sctructural.proxy;

public class Client {
	
	public static void main(String[] args) {
		
		Conta conta = new ContaImpl();
		conta.creditar(1000);
		System.out.println(conta.getSaldo());
		
		Conta conta2 = new ContaProxyImpl();
		conta2.creditar(1000);
		System.out.println(conta2.getSaldo());
		
	}

}
