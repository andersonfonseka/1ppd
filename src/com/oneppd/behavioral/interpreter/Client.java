package com.oneppd.behavioral.interpreter;

public class Client {
	
	public static void main(String[] args) {
		
		AbstractExpression abstractExpression = new TerminalExpression();
		abstractExpression.interpret(new Context());
		
	}

}
