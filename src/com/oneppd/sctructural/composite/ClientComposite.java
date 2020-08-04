package com.oneppd.sctructural.composite;

public class ClientComposite {

	public static void main(String[] args) {
		
		Composite root = new Composite();
		
		Composite composite1 = new Composite();
		root.add(composite1);
		
		Leaf leaf1 = new Leaf();
		root.add(leaf1);
		
		Leaf leaf2 = new Leaf();
		root.getChild(composite1).add(leaf2);
		
		root.getChild(composite1).getChild(leaf2).add(new Leaf());
		
		System.out.println(root);
		
	}
	
}
