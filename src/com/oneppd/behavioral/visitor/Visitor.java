package com.oneppd.behavioral.visitor;

public interface Visitor {
	
	void visit(Person person);
	void visit(Jump jump);
    void visit(Swim swim);
    void visit(Sleep sleep);

}
