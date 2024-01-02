package com.Collection;

import java.util.ArrayList;

public class DemoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// list 
		ArrayList <Integer>al=new  ArrayList<>();
		//Integer i=new Integer(10);
		al.add(10); //auto boxing
	    //al.add("abcd");
		al.add(10);
		//al.add(21.5f);
		al.add(300);
		al.add(150);
		//list out of the element of the collection
		
      System.out.println(al);
		
      for(Integer i:al)
    	  System.out.println(i);
      // find out  tje size of the collection
      
      System.out.println("size of the object "+al.size());
      

      //check id an object is existing
      boolean flag =al.contains(150);
      System.out.println("obj is present "+flag);
      
      // remove all object
      al.clear();
      System.out.println("after clearing the collection"+al);
}
}
