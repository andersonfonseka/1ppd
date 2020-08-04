package com.oneppd.sctructural.decorator;

public class WindowDecorator implements Window {

	private Window windowToBeDecorated;
	
	public WindowDecorator(Window windowToBeDecorated) {
		super();
		this.windowToBeDecorated = windowToBeDecorated;
	}

	@Override
	public void draw() {
		windowToBeDecorated.draw();
	}

	@Override
	public String getDescription() {
		return windowToBeDecorated.getDescription();
	}

}
