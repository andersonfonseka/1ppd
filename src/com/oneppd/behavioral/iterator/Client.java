package com.oneppd.behavioral.iterator;

public class Client {
	
	public static void main(String[] args) {
		
		int[] numeros = new int[]{1,2,3};
		
		Iterator iterator = new ArrayIterator(numeros);
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
	}

}
