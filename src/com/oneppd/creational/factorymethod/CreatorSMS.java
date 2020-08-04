package com.oneppd.creational.factorymethod;

public class CreatorSMS extends Creator {

	@Override
	public AgenteNotificacao factoryMethod() {
		return new AgenteNotificacaoSMSImpl();
	}

}
