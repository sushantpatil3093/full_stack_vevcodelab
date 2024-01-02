package com.Collection;

import java.util.ArrayList;

public class DemoList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<StudentData> al=new ArrayList<>();
    StudentData s1=new StudentData(2,"spring",100,100);
    al.add(new  StudentData(1,"java",99,90));
    al.add(s1);
    al.add(new StudentData(1,"java",99,90));
    al.add(new StudentData(9,"structs",99,78));
    al.add(new StudentData(19,"struct",99,78));
    
    for(StudentData s:al)
    	System.out.println(s);
    
    
	}
}
class StudentData{
	int stdId;
	String stdName;
	int mks_csc;
	int mks_mm;
	public StudentData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentData(int stdId, String stdName, int mks_csc, int mks_mm) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.mks_csc = mks_csc;
		this.mks_mm = mks_mm;
	}
	@Override
	public String toString() {
		return "StudentData [stdId=" + stdId + ", stdName=" + stdName + ", mks_csc=" + mks_csc + ", mks_mm=" + mks_mm
				+ "]";
	}
	
}