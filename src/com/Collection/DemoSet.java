package com.Collection;

import java.util.HashSet;
import java.util.TreeSet;

public class DemoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer>hs=new HashSet<>();
		hs.add(1);
		hs.add(1); //duplicate
		hs.add(2);
		hs.add(3);
		//hs.add(4);
		hs.add(5);
		
		//listing out the object in the collection  
		System.out.println(hs);
		HashSet<String>h2=new HashSet<>();
		h2.add("java");
		h2.add("spring");
		h2.add("axios");
		h2.add("java ");
		h2.add("jAva");
		h2.add("11");
		System.out.println("simple hash set");
	//	System.out.println(h2);
		
		TreeSet<String>ts=new TreeSet<>(h2);
		System.out.println(ts);
	}

}
