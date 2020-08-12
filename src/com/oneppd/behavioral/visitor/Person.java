package com.oneppd.behavioral.visitor;

public class Person implements Visitable {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void walk() {
		System.out.println("Person.walk() called");
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	

}
