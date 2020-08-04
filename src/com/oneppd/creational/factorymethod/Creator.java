package com.oneppd.creational.factorymethod;

public abstract class Creator {
	
	public abstract AgenteNotificacao factoryMethod();
	
	public void enviar(String mensagem){
		factoryMethod().enviar(mensagem);
	}

}
