package com.oneppd.creational.abstractfactory.database;

import com.oneppd.creational.abstractfactory.database.hsqldb.ConcreteFactoryDatabaseHSQLDB;
import com.oneppd.creational.abstractfactory.database.oracle.ConcreteFactoryDatabaseOracle;

public abstract class DatabaseAbstractFactory {
	
	
	public static DatabaseAbstractFactory getInstance(String tipo) {
		if (tipo.equals(Databasetype.MYSQL)) {
			return new ConcreteFactoryDatabaseHSQLDB();
		} else if (tipo.equals(Databasetype.HSQLDB)) {
			return new ConcreteFactoryDatabaseHSQLDB();
		} else if (tipo.equals(Databasetype.ORACLE)) {
			return new ConcreteFactoryDatabaseOracle();
		}
		return new ConcreteFactoryDatabaseHSQLDB();
	}

	public abstract Database createDatabase();
	
}
