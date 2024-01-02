package com.Practice;
public class CheckedExceptionAppliaction {
     int id;
	String name;
public CheckedExceptionAppliaction() {
		super();
		// TODO Auto-generated constructor stub
}
public CheckedExceptionAppliaction(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void apply(int age) throws AssignCheckedException {
      if(age<18 ){
    	  System.out.println(" ");
    	  throw new AssignCheckedException (age);
    	  
    	        }else if(age>65) {
		System.out.println("you are over age");
	}else {
			System.out.println("you are eligibal");
		}
	
	}
	}
