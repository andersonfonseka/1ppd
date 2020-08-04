package com.oneppd.creational.factorymethod;

import java.util.logging.Logger;

import com.oneppd.creational.abstractfactory.database.DatabaseImpl;

public class AgenteNotificacaoWSImpl implements AgenteNotificacao {

	Logger LOGGER = Logger.getLogger(DatabaseImpl.class.getSimpleName());
	
	@Override
	public void enviar(String mensagem) {
		LOGGER.info("Enviando '" + mensagem + "' por Web services...");
	}
	
}
