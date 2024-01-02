package com.io;

import java.io.BufferedReader;


import java.io.FileNotFoundException;
import java.io.FileReader;

public class DemoFileRead {

	public static void main(String[] args) {
		// read data from a text file
		
	
		FileReader fr;
		BufferedReader br;
		String data;
		//create an object
		
		try {
			fr=new FileReader("D:\\spatil\\core basic.txt");
			br=new BufferedReader(fr);
			data =br.readLine();
			while(data != null)
				System.out.println("data is"+data);
			data=br.readLine();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

	}
	}
}
