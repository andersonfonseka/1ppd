package com.oneppd.creational.abstractfactory.database;

import java.util.logging.Logger;

public class DatabaseImpl implements Database {
	
	public static Logger LOGGER = Logger.getLogger(DatabaseImpl.class.getSimpleName());

	@Override
	public void save() {
		DatabaseImpl.LOGGER.info("Record data for " + this.getClass().getSimpleName());
	}
	
}
