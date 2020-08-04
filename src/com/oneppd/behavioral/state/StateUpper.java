package com.oneppd.behavioral.state;

public class StateUpper implements State {

	@Override
	public void operation(Context context, String data) {
		System.out.println(data.toLowerCase());
		context.setState(new StateNothing());
	}

}
