package com.oneppd.creational.abstractfactory;

import java.util.logging.Logger;

import com.oneppd.creational.abstractfactory.database.Database;
import com.oneppd.creational.abstractfactory.database.DatabaseAbstractFactory;
import com.oneppd.creational.abstractfactory.database.DatabaseImpl;
import com.oneppd.creational.abstractfactory.database.Databasetype;

public class Client {
	
	public static void main(String[] args) {
		
		Logger LOGGER = Logger.getLogger(DatabaseImpl.class.getSimpleName());
		
		DatabaseAbstractFactory abstractFactory = DatabaseAbstractFactory.getInstance(Databasetype.ORACLE);
		
		Database db = abstractFactory.createDatabase();
		
		LOGGER.info(db.toString());
	
		db.save();
		
	}

}
