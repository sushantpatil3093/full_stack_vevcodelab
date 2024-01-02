package com.io;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoFileWrite {

	public static void main(String[] args) {
		
		//accept the data from the user
		
		BufferedReader br;
		InputStreamReader isr;
		
		
		//write the end data into a text file
	FileWriter fw;  
	
	//create  texy file
	
	try {
		fw=new FileWriter("Student.txt",true);
		br=new BufferedReader(new InputStreamReader(System.in)); //now br object to accept is ready 
		
		System.out.println("enter student id");
		String id=br.readLine();
		
		System.out.println("enter name");
		String name=br.readLine();
		
		System.out.println("enter math marks");
		String mks_mm=br.readLine();
		
		
		fw.write(id);
		fw.write("#");
		fw.write(name);
		fw.write("#");
		fw.write(mks_mm);
		fw.write("\n");
		fw.close();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	

}
