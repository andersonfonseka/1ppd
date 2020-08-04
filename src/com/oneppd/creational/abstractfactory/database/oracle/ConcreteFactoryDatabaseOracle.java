package com.oneppd.creational.abstractfactory.database.oracle;

import com.oneppd.creational.abstractfactory.database.DatabaseAbstractFactory;

public class ConcreteFactoryDatabaseOracle extends DatabaseAbstractFactory {


	public DatabaseOracle createDatabase() {
		return new ProdutoOracleBImpl();
	}



}
