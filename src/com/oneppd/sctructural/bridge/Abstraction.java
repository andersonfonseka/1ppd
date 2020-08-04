package com.oneppd.sctructural.bridge;

public abstract class Abstraction {
	
	protected Implementor implementor;

	public Abstraction(Implementor implementor) {
		super();
		this.implementor = implementor;
	}
	
	public abstract void operation();
	
	public abstract void notification();
}
