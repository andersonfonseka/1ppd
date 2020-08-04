package com.oneppd.sctructural.decorator;

public class SimpleWindow implements Window {

	@Override
	public void draw() {
		System.out.println(this.getClass().getSimpleName() + " drew");
	}

	@Override
	public String getDescription() {
		return this.getClass().getSimpleName();
	}

}
