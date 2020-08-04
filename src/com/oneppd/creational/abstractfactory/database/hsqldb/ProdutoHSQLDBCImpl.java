package com.oneppd.creational.abstractfactory.database.hsqldb;

import com.oneppd.creational.abstractfactory.database.DatabaseImpl;

public class ProdutoHSQLDBCImpl extends DatabaseImpl implements DatabaseHSQLDB {
	
	@Override
	public void save() {
		DatabaseImpl.LOGGER.info("Record data for " + this.getClass().getSimpleName() + "Teste HSQLDB AAAAAAAA");
	}
	
}
