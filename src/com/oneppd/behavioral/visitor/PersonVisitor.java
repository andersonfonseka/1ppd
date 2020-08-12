package com.oneppd.behavioral.visitor;

public class PersonVisitor implements Visitor {

	@Override
	public void visit(Jump jump) {
		System.out.println("PersonVisitor.jump() called");
	}

	@Override
	public void visit(Swim swim) {
		System.out.println("PersonVisitor.swim() called");
	}

	@Override
	public void visit(Sleep sleep) {
		System.out.println("PersonVisitor.sleep() called");
	}

	@Override
	public void visit(Person person) {
		System.out.println("PersonVisitor.person() called");
	}

}
