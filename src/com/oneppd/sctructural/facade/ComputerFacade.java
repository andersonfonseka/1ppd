package com.oneppd.sctructural.facade;

public class ComputerFacade {

	private CPU processor;
	private Memory ram;
	private HardDrive hd;

	public ComputerFacade() {
		this.processor = new CPU();
		this.ram = new Memory();
		this.hd = new HardDrive();
	}

	public void start() {
		processor.freeze();
		ram.load(1L, hd.read(1L, 512));
		processor.jump(1024);
		processor.execute();
	}

}
