package com.oneppd.creational.singleton;

import java.util.logging.Logger;

import com.oneppd.creational.abstractfactory.database.DatabaseImpl;

public class ClientSingleton {
	
	public static void main(String[] args) {
		
		Logger LOGGER = Logger.getLogger(DatabaseImpl.class.getSimpleName());
		
		Singleton singleton = Singleton.getInstance();
		LOGGER.info(singleton.toString());
		
		Singleton singleton2 = Singleton.getInstance();
		LOGGER.info(singleton2.toString());
		
	}

}
