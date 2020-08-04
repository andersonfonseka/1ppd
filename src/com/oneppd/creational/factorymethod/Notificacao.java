package com.oneppd.creational.factorymethod;

public class Notificacao {
	
	private String mensagem;
	
	private int opcao;
	
	public Notificacao(String mensagem, int opcao) {
		super();
		this.mensagem = mensagem;
		this.opcao = opcao;
	}

	public void enviar(){
		
		Creator creator = null;
		
		switch (opcao) {
		case 1:
			creator = new CreatorEmail();
			break;
		case 2:
			creator = new CreatorSMS();
			break;
		case 3:
			creator = new CreatorWS();
			break;	
		default: 
			creator = new CreatorChamadaVoz();
		}
			
		creator.enviar(this.mensagem);
	}

}
