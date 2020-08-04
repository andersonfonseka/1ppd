package com.oneppd.creational.prototype;

import java.util.Arrays;
import java.util.List;

public class ProductImpl implements Product, Cloneable {

	private List<String> products;
	
	public ProductImpl(String[] description) {
		super();
		this.products = Arrays.asList(description);
	}

	@Override
	public List<String> getProducts() {
		return this.products;
	}

	@Override
	public Product clone() throws CloneNotSupportedException {
		return (Product) super.clone();
	}

}
