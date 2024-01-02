package com.exception.checked;

public class LicenseApplication {
//properties
	int id;
	String name;
	//cons default oveloaded
	public LicenseApplication() {
		super();
		// TODO Auto-generated constructor stub
	}
	//parameters cons
	public LicenseApplication(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void applyForLicense(int age) throws AgeException {
		// business logic
		if(age<16)
			
			throw new AgeException(age);
		else 
			System.out.println("cand eligible for licence");
	}
}
