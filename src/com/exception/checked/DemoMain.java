package com.exception.checked;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LicenseApplication li=new LicenseApplication(123,"rishi");

		try {
			li.applyForLicense(12);
		} catch (AgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("sorry, you are eligibal after "+(16-e.getAge())+" yrs");
		}
	}

	
}
