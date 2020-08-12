package com.oneppd.behavioral.chainofresponsibility;

public class Client {

	public static void main(String[] args) {
		
		PresidenteAprovador presidenteAprovador = new PresidenteAprovador(null);
		VPAprovador vpAprovador = new VPAprovador(presidenteAprovador);
		DiretorAprovador diretorAprovador = new DiretorAprovador(vpAprovador);
		GerenteAprovador gerenteAprovador = new GerenteAprovador(diretorAprovador);
		
		Pedido pedido = new Pedido(1000, "Conversa com uma modelo capa da revista");
		
		gerenteAprovador.processRequest(pedido);
		
	}
	
}
