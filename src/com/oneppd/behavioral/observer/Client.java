package com.oneppd.behavioral.observer;

public class Client {

	public static void main(String[] args) {
		
		AtividadePrincipal principal = new AtividadePrincipal();
		
		principal.add(new AtividadeSecundaria());
		principal.add(new AtividadeTerciaria());
		
		principal.notify("Texto de teste 123...");
		
	}
	
}
