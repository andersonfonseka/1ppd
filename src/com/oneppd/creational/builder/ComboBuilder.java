package com.oneppd.creational.builder;

import com.oneppd.creational.builder.produtos.BatataFrita;
import com.oneppd.creational.builder.produtos.Brinquedo;
import com.oneppd.creational.builder.produtos.Hamburguer;
import com.oneppd.creational.builder.produtos.Refrigerante;

public class ComboBuilder implements Builder {
	
	private String descricao;
	
	private String tamanho;
	
	private String tipo;
	
	private String marca;
	
	private String brinquedo;
	
	public ComboBuilder(String descricao, String tamanhoBatataFrita, String tipoHambruger, String marcaRefri) {
		super();
		this.descricao = descricao;
		this.tamanho = tamanhoBatataFrita;
		this.tipo = tipoHambruger;
		this.marca = marcaRefri;
	}
	
	public ComboBuilder(String descricao, String tamanhoBatataFrita, 
				String tipoHambruger, String marcaRefri, String nomeBrinquedo) {
		super();
		this.descricao = descricao;
		this.tamanho = tamanhoBatataFrita;
		this.tipo = tipoHambruger;
		this.marca = marcaRefri;
		this.brinquedo = nomeBrinquedo;
	}

	public BatataFrita buildBatataFrita(){
		return new BatataFrita(tamanho);
	}
	
	public Hamburguer buildHamburguer(){
		return new Hamburguer(tipo);
	}

	public Refrigerante buildRefrigerante(){
		return new Refrigerante(marca);
	}

	@Override
	public String buildDescricao() {
		return this.descricao;
	}

	@Override
	public Brinquedo buildBrinquedo() {
		return new Brinquedo(this.brinquedo);
	}

}
