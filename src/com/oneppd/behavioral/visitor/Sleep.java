package com.oneppd.behavioral.visitor;

public class Sleep implements Visitable {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
