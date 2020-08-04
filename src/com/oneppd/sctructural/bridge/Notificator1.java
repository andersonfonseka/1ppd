package com.oneppd.sctructural.bridge;

public class Notificator1 extends Implementor1 implements Notificator {

	@Override
	public void message() {
		System.out.println("Notificacao 1");
	}


}
