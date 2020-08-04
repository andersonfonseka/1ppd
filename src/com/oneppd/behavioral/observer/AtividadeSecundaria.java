package com.oneppd.behavioral.observer;

public class AtividadeSecundaria implements Observer {

	@Override
	public void update(Object obj) {
		System.out.println(this.getClass().getSimpleName() + " notified! :" + obj);
	}

}
