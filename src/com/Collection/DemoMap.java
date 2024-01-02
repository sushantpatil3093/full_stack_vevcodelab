package com.Collection;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String>m=new HashMap<>();
		
		//add object to the collection
		
		m.put(91, "india");
		m.put(91, "bharat");
		m.put(911, "usa");
		//list out all the element
		System.out.println(m);
		System.out.println(m.keySet());
		//retrival the value for key 91
		System.out.println(m.get(91));
	}

}
