package com.oneppd.sctructural.decorator;

public class HorizontalScrollBarDecorator extends WindowDecorator {

	public HorizontalScrollBarDecorator(Window windowToBeDecorated) {
		super(windowToBeDecorated);
	}

	@Override
	public void draw() {
		super.draw();
		drawHorizontalScrollBar();
	}
	
	private void drawHorizontalScrollBar(){
		System.out.println("drawHorizontalScrollBar performed !!!");
	}

	@Override
	public String getDescription() {
		return super.getDescription();
	}

}
