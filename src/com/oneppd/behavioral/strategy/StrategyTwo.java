package com.oneppd.behavioral.strategy;

import java.util.logging.Logger;

public class StrategyTwo implements Strategy {

	public static Logger LOGGER = Logger.getLogger(StrategyOne.class.getSimpleName());
	
	@Override
	public void algorithm() {
		StrategyTwo.LOGGER.info("Record data for " + this.getClass().getSimpleName());
	}

}
