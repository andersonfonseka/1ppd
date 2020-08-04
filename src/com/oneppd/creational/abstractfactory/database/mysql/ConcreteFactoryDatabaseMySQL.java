package com.oneppd.creational.abstractfactory.database.mysql;

import com.oneppd.creational.abstractfactory.database.DatabaseAbstractFactory;

public class ConcreteFactoryDatabaseMySQL extends DatabaseAbstractFactory {

	public DatabaseMySQL createDatabase() {
		return new ProdutoMySQLAImpl();
	}


}
