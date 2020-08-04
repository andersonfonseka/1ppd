package com.oneppd.behavioral.mediator;

public interface Mediator {

	void registrarMotor(Motor motor);
	
	void registrarArCondicionado();
	
	Motor getMotor();
	
	ArCondicionado getArCondicionado();
	
	
	
}
