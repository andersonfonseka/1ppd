package com.oneppd.creational.builder;

import com.oneppd.creational.builder.produtos.BatataFrita;
import com.oneppd.creational.builder.produtos.Brinquedo;
import com.oneppd.creational.builder.produtos.Hamburguer;
import com.oneppd.creational.builder.produtos.Refrigerante;

public interface Builder {

	String buildDescricao();
	
	BatataFrita buildBatataFrita();

	Hamburguer buildHamburguer();

	Refrigerante buildRefrigerante();
	
	Brinquedo buildBrinquedo();

}
