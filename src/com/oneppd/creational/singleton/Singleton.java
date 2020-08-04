package com.oneppd.creational.singleton;

import java.util.concurrent.locks.ReentrantLock;

public class Singleton {

	private static Singleton INSTANCE;

	private static ReentrantLock lock = new ReentrantLock();
	
	private Singleton() {}

	public static Singleton getInstance() {

		if (null == INSTANCE) {
			lock.lock();
				if (null == INSTANCE) {
					INSTANCE = new Singleton();
				}
			lock.unlock();	
		}

		return INSTANCE;
	}

}
