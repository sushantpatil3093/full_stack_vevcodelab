package com.io;
import java.io.FileReader;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.StringTokenizer;

public class DemoST {

	public static void main(String[] args) {
		
		FileReader fr;
		String data ;
		BufferedReader br;
		
		StringTokenizer st;
		
		
			try {
				fr=new FileReader("Student.txt");
				br=new BufferedReader(fr);
				data=br.readLine();
				while(data !=null) {
					
					// split the given String object
					st=new StringTokenizer( data,"#");
					
					//itereat until end of the string
					while(st.hasMoreElements()) {
						String id=st.nextToken();
						String name=st.nextToken();
						String mks=st.nextToken();
						System.out.println("id " + id + "name " +name+ "marks "+mks);
						
						
					}
					
					data =br.readLine();
				}
				} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
			catch (Exception e) {
				
			}
			
	}

}
