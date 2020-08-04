package com.oneppd.sctructural.flyweight;

public class CoffeeFlavour implements Cloneable {
	
	String flavour;

	public CoffeeFlavour(String flavour) {
		super();
		this.flavour = flavour;
	}

	public String getFlavour() {
		return flavour;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	

}
