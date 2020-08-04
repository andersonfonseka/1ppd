package com.oneppd.sctructural.decorator;

public class ClientDecorator {

	public static void main(String[] args) {
		
		Window window = new SimpleWindow();
		window.draw();
		
		window = new WindowDecorator(new VerticalScrollBarDecorator(new HorizontalScrollBarDecorator(window)));
		window.draw();
	}
	
}
