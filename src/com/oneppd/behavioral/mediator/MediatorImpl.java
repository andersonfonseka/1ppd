package com.oneppd.behavioral.mediator;

public class MediatorImpl implements Mediator {

	private Motor motor;
	
	private ArCondicionado arCondicionado;
	
	@Override
	public void registrarMotor(Motor motor) {
		this.motor = motor;
	}

	@Override
	public void registrarArCondicionado() {
		if (this.motor.getPotencia() == 1.0){
			this.arCondicionado = new ArCondicionado("7000");
		} else 	if (this.motor.getPotencia() == 1.6){
			this.arCondicionado = new ArCondicionado("10000");
		}
	}

	@Override
	public Motor getMotor() {
		return this.motor;
	}

	@Override
	public ArCondicionado getArCondicionado() {
		return this.arCondicionado;
	}

}
