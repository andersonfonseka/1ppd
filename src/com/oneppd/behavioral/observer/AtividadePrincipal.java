package com.oneppd.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class AtividadePrincipal {
	
	private List<Observer> observers = new ArrayList<Observer>();
	
	public void add(Observer observer){
		observers.add(observer);
	}
	
	public void notify(Object obj){
		for (Observer observer : observers) {
			observer.update(obj);
		}
	}

}
