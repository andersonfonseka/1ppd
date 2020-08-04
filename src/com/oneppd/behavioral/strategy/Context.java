package com.oneppd.behavioral.strategy;

public class Context {
	
	public void operation() {
		Strategy strategy = new StrategyTwo();
				 strategy.algorithm();
	}

}
