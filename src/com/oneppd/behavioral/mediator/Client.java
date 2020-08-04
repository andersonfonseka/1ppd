package com.oneppd.behavioral.mediator;

public class Client {

	public static void main(String[] args) {
		
		Mediator mediator = new MediatorImpl();
		mediator.registrarMotor(new Motor(1.6));
		mediator.registrarArCondicionado();
		
		System.out.println(mediator.getArCondicionado().getBtus());
		
	}
	
}
