package com.oneppd.behavioral.templatemethod;

public class Client {
	
	public static void main(String[] args) {
		
		AbstractClass class1 = new ConcreteOne();
		AbstractClass class2 = new ConcreteTwo();

		class1.templateMethod();
		class2.templateMethod();
		
	}

}
