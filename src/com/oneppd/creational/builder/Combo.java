package com.oneppd.creational.builder;

import com.oneppd.creational.builder.produtos.BatataFrita;
import com.oneppd.creational.builder.produtos.Brinquedo;
import com.oneppd.creational.builder.produtos.Hamburguer;
import com.oneppd.creational.builder.produtos.Refrigerante;

public class Combo {
	
	private String descricao;

	private BatataFrita batataFrita;
	
	private Hamburguer hamburguer;
	
	private Refrigerante refrigerante;
	
	private Brinquedo brinquedo;
	
	@SuppressWarnings("unused")
	private Combo(){}
	
	public Combo(Builder builder) {
		super();
		this.descricao = builder.buildDescricao();
		this.batataFrita = builder.buildBatataFrita();
		this.hamburguer = builder.buildHamburguer();
		this.refrigerante = builder.buildRefrigerante();
		this.brinquedo = builder.buildBrinquedo();
	}
	
	public String getDescricao() {
		return descricao;
	}

	public BatataFrita getBatataFrita() {
		return batataFrita;
	}

	public Hamburguer getHamburguer() {
		return hamburguer;
	}

	public Refrigerante getRefrigerante() {
		return refrigerante;
	}
	
	public Brinquedo getBrinquedo() {
		return brinquedo;
	}
	
	@Override
	public String toString(){
		
		StringBuilder sb = new StringBuilder();
					  sb.append("Combo : " + this.getDescricao() + "\n");
					  sb.append("Batata Frita : " + this.getBatataFrita().getTamanho() + "\n");
					  sb.append("Hamburguer : " + this.getHamburguer().getTipo() + "\n");
					  sb.append("Refrigerante : " + this.getRefrigerante().getMarca() + "\n");
					  sb.append("Brinquedo : " + this.getBrinquedo().getDescricao() + "\n");
		
		return sb.toString();
	}
}
