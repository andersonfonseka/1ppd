package com.oneppd.creational.factorymethod;

public class ClientFactoryMethod {

	public static void main(String[] args) {
		
		Notificacao notificacao = new Notificacao("teste de envio email", 3);
		notificacao.enviar();
		
	}
	
}
