package com.oneppd.creational.factorymethod;

public class CreatorWS extends Creator {

	@Override
	public AgenteNotificacao factoryMethod() {
		return new AgenteNotificacaoWSImpl();
	}

}
