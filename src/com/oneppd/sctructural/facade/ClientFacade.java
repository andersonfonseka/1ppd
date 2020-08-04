package com.oneppd.sctructural.facade;

public class ClientFacade {

	public static void main(String[] args) {
		
		ComputerFacade facade = new ComputerFacade();
		facade.start();
		
		TesteFacade testeFacade = TesteFacade.getInstance();
		testeFacade.jumpCPU();
		testeFacade.loadMemory();
		testeFacade.getHardDrive();
		
	}
	
}
