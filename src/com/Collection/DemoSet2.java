package com.Collection;

import java.util.HashSet;

import java.util.Objects;

public class DemoSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentData1 sd1=new StudentData1(1,"java");
		StudentData1 sd2=new StudentData1(1,"java");
		
		StudentData1 sd3=sd2;
		StudentData1 sd4=new StudentData1(4,"java");
		
		System.out.println("sd1 equal sd2 ? "+sd1.equals(sd2));
		System.out.println("sd1 equal sd3 ? "+sd1.equals(sd2));	
		System.out.println("sd1 == sd3 ? "+(sd2==sd3));
		
		System.out.println("mem loc of sd1"+sd1.hashCode());
		System.out.println("mem loc of sd2"+sd2.hashCode());
		System.out.println("mem loc of sd3"+sd3.hashCode());
		System.out.println("mem loc of sd4"+sd4.hashCode());
		
		HashSet<StudentData1>hs=new HashSet<>();
		hs.add(sd1);
		hs.add(sd2);
		hs.add(sd3);
		hs.add(sd4);
		
		System.out.println(hs);
		
	}

}
class StudentData1{
	private int stdId;
	private String stdName;
	public StudentData1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentData1(int stdId, String stdName) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
	}
	@Override
	public String toString() {
		return "StudentData1 [stdId=" + stdId + ", stdName=" + stdName + "]";
	}
	//overide equal method
	@Override
	public int hashCode() {
		return stdId +1;
		
	}
	@Override
	public boolean equals(Object obj) {
		//check for appropriate instance
		//check wether the std id is equal to id that being
		if((obj instanceof StudentData1)&&(((StudentData1)obj).stdId==this.stdId))
return true;
return false;
	}
}
