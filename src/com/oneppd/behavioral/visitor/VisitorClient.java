package com.oneppd.behavioral.visitor;

public class VisitorClient {
	
	public static void main(String[] args) {
		
		
		PersonVisitor personVisitor = new PersonVisitor();
		
		Person p = new Person();
		p.setName("Anderson");
		p.walk();
		p.accept(personVisitor);
		
		personVisitor.visit(new Jump());
		personVisitor.visit(new Sleep());
		personVisitor.visit(new Swim());
		
	}
			

}
