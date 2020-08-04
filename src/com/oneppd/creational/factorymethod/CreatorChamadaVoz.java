package com.oneppd.creational.factorymethod;

public class CreatorChamadaVoz extends Creator {

	@Override
	public AgenteNotificacao factoryMethod() {
		return new AgenteNotificacaoChamadaVozImpl();
	}

}
