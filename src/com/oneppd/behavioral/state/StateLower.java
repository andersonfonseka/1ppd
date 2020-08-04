package com.oneppd.behavioral.state;

public class StateLower implements State {

	@Override
	public void operation(Context context, String data) {
		System.out.println(data.toUpperCase());
		context.setState(new StateUpper());
	}

}
