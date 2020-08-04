package com.oneppd.creational.abstractfactory.database.hsqldb;

import com.oneppd.creational.abstractfactory.database.Database;
import com.oneppd.creational.abstractfactory.database.DatabaseAbstractFactory;

public class ConcreteFactoryDatabaseHSQLDB extends DatabaseAbstractFactory {
	
	public Database createDatabase() {
		return new ProdutoHSQLDBCImpl();
	}

}
