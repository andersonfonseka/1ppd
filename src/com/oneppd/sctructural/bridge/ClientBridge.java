package com.oneppd.sctructural.bridge;

public class ClientBridge {
	
	public static void main(String[] args) {
		
		Abstraction abstraction = new AbstractionRefined(new Notificator1());
		abstraction.operation();
		abstraction.notification();
		
	}

}
