package com.oneppd.sctructural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Component {
	
	private static int counter = 1;
	
	private int id;
	
	private List<Component> components = new ArrayList<Component>();

	public Component(){
		this.id = counter++;
	}

	public void add(Component child) {
		if (this instanceof Composite){
			this.components.add(child);	
		}
	}

	public void remove(Component child) {
		this.components.remove(child);
	}

	public Component getChild(Component child) {
		return this.components.get(this.components.indexOf(child));	
	}
	
	public abstract void operation();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Component other = (Component) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	

}
