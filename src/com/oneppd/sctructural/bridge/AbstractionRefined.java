package com.oneppd.sctructural.bridge;

public class AbstractionRefined extends Abstraction {

	public AbstractionRefined(Implementor implementor) {
		super(implementor);
	}

	@Override
	public void operation() {
		implementor.operation();
	}

	@Override
	public void notification() {
		((Notificator) implementor).message();
	}



}
