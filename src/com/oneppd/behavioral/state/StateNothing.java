package com.oneppd.behavioral.state;

public class StateNothing implements State {

	@Override
	public void operation(Context context, String data) {
		System.out.println("nada a fazer com " + data);
		context.setState(new StateLower());
	}

}
