package com.Practice;

public class AssignCheckedException extends Exception {

	private int age;

	public AssignCheckedException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AssignCheckedException(int age) {
		super();
		this.age = age;
	}
	public int getage() {
		return age;
	}
}
