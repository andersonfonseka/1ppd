package com.oneppd.behavioral.interpreter;

public class NonTerminalExpression extends AbstractExpression {

	@Override
	public void interpret(Context context) {
		System.out.println("Executando interpreta��o..." + this.getClass().getSimpleName());
	}

}
