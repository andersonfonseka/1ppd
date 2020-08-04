package com.oneppd.creational.prototype;

import java.util.logging.Logger;

import com.oneppd.creational.abstractfactory.database.DatabaseImpl;

public class ClientPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Logger LOGGER = Logger.getLogger(DatabaseImpl.class.getSimpleName());
		
		Prototype prototype = new ProductImpl(new String[] {"Caneta", "Lapis", "Caderno"});

		Product productA = prototype.clone();
		Product productB = prototype.clone(); 
		Product productC = prototype.clone(); 
		
		LOGGER.info(productA.toString() + " - " + productA.getProducts());
		LOGGER.info(productB.toString() + " - " + productB.getProducts());
		LOGGER.info(productC.toString() + " - " + productC.getProducts());
		
		
	}
	
}
