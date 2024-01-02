package com.exception.checked;

//custom exception class 
public class AgeException extends  Exception {
	private int age;
	//default constructors

	public AgeException() {
		super();
		
	}

	public AgeException(int age) {
		super();
		this.age = age;
	}
	public int getAge() { //acees specifies 
		return age;
		
	}

}
