package com.oneppd.behavioral.interpreter;

public class TerminalExpression extends AbstractExpression {

	@Override
	public void interpret(Context context) {
		System.out.println("Executando interpretação..." + this.getClass().getSimpleName());
	}

}
