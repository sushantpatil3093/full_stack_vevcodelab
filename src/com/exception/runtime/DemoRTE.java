package com.exception.runtime;

public class DemoRTE {

	public static void main(String[] args) {
		

		try {
		int len=args.length; // getting length arry
		int num =10/len;     //compile doesn't know even len can be 0
		System.out.println("num val is "+ num);
		}
		catch(ArithmeticException ae) {
			System.out.println("error");
		}
		try {
		A a=null;
		a.showData();
		}
		catch(NullPointerException ne) {
			ne.printStackTrace();
		}
		try {
			
		
		System.out.println("command line argument are "+ args[0]+" "+args[1]);
	}
	catch(ArithmeticException aio) {
		
		aio.printStackTrace();
	}
		finally { //irrespective block of code block of code excuted used to close connection db ,socket, N/W
			
		}
	System.out.println("finally, all over and done");
		


		}
}
	class A{
		int temp;

		public A() {
			super();
			// TODO Auto-generated constructor stub
		}
		void showData() {
			System.out.println("temp value is ");
		}
	}