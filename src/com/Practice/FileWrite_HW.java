package com.Practice;
import java.io.BufferedReader;


import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWrite_HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
		BufferedReader br;
		InputStreamReader isr;
		FileWriter fw;
		
	    try {
			fw=new FileWriter("student.txt",true);
			br=new BufferedReader(new InputStreamReader(System.in));
		    
			System.out.println("enter std id");
			String id=br.readLine();
			System.out.println("name");
			String name=br.readLine();
			
			System.out.println("std marks");
			String mks_mm=br.readLine();
			
			fw.write("id");
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
