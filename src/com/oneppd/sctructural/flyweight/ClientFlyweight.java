package com.oneppd.sctructural.flyweight;

public class ClientFlyweight {

	public static void main(String[] args) {
		
		ICoffeeFlavourFactory factory = new MinimumMemoryFootprint();
		
		CoffeeFlavour coffeeFlavour = factory.getFlavour("mussulo");
					  coffeeFlavour = factory.getFlavour("timor");
					  coffeeFlavour = factory.getFlavour("ristreto");
		
		System.out.println(coffeeFlavour);
		
		for (int i = 0; i < 100; i++) {
			coffeeFlavour = factory.getFlavour("timor");
			System.out.println(coffeeFlavour);
		}
	}
}
