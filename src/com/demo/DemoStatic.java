package com.demo;

public class DemoStatic {


		public static void main(String[] args) {
			
			FundsCollected per1 = new FundsCollected("abhi",100);
			FundsCollected per2 = new FundsCollected("rishi",100);
			FundsCollected per3 = new FundsCollected("varsha", 100); 
			FundsCollected per4 = new FundsCollected("ashu",100);
			FundsCollected per5 = new FundsCollected ("uday", 100);
			System.out.println(FundsCollected.showFundsColected());
		}
	}
		class FundsCollected{
			private String name;
			private int donation; 
			private static int total_funds=0; // class variable
			FundsCollected (String name, int donation) {
			this.name=name;
			this.donation=donation; // inc the total funds
			total_funds+=donation;
			}
			
			static int showFundsColected() {
				
			test(); // a static method cannot access non-static method 
			//System.out.println(name); // a static method cannot access non-static data
			int temp;
			return total_funds;
			}
			static void test() {
				
			}
		
	
}
