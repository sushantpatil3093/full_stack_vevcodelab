package com.Practice;

public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
CheckedExceptionAppliaction a=new CheckedExceptionAppliaction(1,"sushant");


try {
	a.apply(11);
} catch (AssignCheckedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	
	
	}

}
