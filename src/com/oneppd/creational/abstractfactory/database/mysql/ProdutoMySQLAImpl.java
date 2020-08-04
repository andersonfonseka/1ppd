package com.oneppd.creational.abstractfactory.database.mysql;

import com.oneppd.creational.abstractfactory.database.DatabaseImpl;

public class ProdutoMySQLAImpl extends DatabaseImpl implements DatabaseMySQL {
	
	@Override
	public void save() {
		DatabaseImpl.LOGGER.info("Record data for " + this.getClass().getSimpleName() + "Teste MySQL AAAAAAAA");
	}
	
}
