package com.oneppd.behavioral.iterator;

public class ArrayIterator implements Iterator {

	private int[] array;
	
	private int pos;
	
	public ArrayIterator(int[] array) {
		super();
		this.array = array;
	}
	

	@Override
	public Object next() {
		return array[pos++];
	}

	@Override
	public boolean hasNext() {
		return pos < array.length;
	}
	
	
}
