package com.oneppd.creational.factorymethod;

public class CreatorEmail extends Creator {

	@Override
	public AgenteNotificacao factoryMethod() {
		return new AgenteNotificacaoEmailImpl();
	}

}
