package com.oneppd.behavioral.memento;

public class Client {
	
	public static void main(String[] args) {
		
		Conta conta = new ContaImplProxy();
		conta.setCliente("Anderson Fonseca");
		conta.save();
		
		System.out.println("Original value.. " + conta.getCliente());
		conta.setCliente("Joana Francesa");
		System.out.println("New value... " + conta.getCliente());		
		
		conta.undo();
		System.out.println("Rolledback value... " + conta.getCliente());
		
	}

}
