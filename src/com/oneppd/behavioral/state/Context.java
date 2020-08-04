package com.oneppd.behavioral.state;

public class Context {
	
	private State state = new StateLower();
	
	public Context(){}

	public void setState(State state) {
		this.state = state;
	}

	public void operation(String data) {
		state.operation(this, data);
	}
	
}
