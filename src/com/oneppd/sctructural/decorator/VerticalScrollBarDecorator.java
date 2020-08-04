package com.oneppd.sctructural.decorator;

public class VerticalScrollBarDecorator extends WindowDecorator {

	public VerticalScrollBarDecorator(Window windowToBeDecorated) {
		super(windowToBeDecorated);
	}

	@Override
	public void draw() {
		super.draw();
		drawVerticalScrollBar();
	}
	
	private void drawVerticalScrollBar(){
		System.out.println("drawVerticalScrollBar performed !!!");
	}

	@Override
	public String getDescription() {
		return super.getDescription();
	}

}
