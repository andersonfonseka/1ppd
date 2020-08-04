package com.oneppd.creational.builder;

import java.util.logging.Logger;

import com.oneppd.creational.abstractfactory.database.DatabaseImpl;

public class ClientBuilder {

	public static void main(String[] args) {

		Logger LOGGER = Logger.getLogger(DatabaseImpl.class.getSimpleName());
		
		Builder[] builderCombos = new Builder[]{new ComboUmBuilder(), 
								  new ComboDoisBuilder(), 
								  new ComboTresBuilder(),
								  new ComboQuatroBuilder()};
		
		Combo[] combos = new Combo[builderCombos.length];
		
		for (int i = 0; i < combos.length; i++) {
			
			combos[i] = new Combo(builderCombos[i]);
			LOGGER.info(combos[i].toString());
		}
		

	}
}
