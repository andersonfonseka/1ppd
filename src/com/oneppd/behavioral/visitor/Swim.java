package com.oneppd.behavioral.visitor;

public class Swim implements Visitable {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}