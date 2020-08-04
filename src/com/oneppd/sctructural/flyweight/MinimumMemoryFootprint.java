package com.oneppd.sctructural.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MinimumMemoryFootprint implements ICoffeeFlavourFactory {

	private Map<String, CoffeeFlavour> map = new ConcurrentHashMap<String, CoffeeFlavour>();
	
	@Override
	public CoffeeFlavour getFlavour(String flavour) {
		
		if (map.containsKey(flavour)){
			return map.get(flavour);
		} 
		
		CoffeeFlavour coffeeFlavour = new CoffeeFlavour(flavour);
		map.put(flavour, coffeeFlavour);
		
		return coffeeFlavour;
	}

}
