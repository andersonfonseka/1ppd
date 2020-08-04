package com.oneppd.sctructural.facade;

public class TesteFacade {

	private static TesteFacade INSTANCE;

	private TesteFacade() {
	}

	public static TesteFacade getInstance() {

		if (INSTANCE == null) {
			synchronized (TesteFacade.class) {
				if (INSTANCE == null) {
					INSTANCE = new TesteFacade();

				}
			}
		}

		return INSTANCE;
	}
	
	public void jumpCPU() {
		new CPU().jump(1024);;
	}
	
	public void getHardDrive() {
		new HardDrive().read(1, 256);
	}
	
	public void loadMemory() {
		new Memory().load(1L, new byte[1024]);
	}

}
