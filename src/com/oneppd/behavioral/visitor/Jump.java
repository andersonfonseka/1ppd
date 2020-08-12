package com.oneppd.behavioral.visitor;

public class Jump implements Visitable {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
