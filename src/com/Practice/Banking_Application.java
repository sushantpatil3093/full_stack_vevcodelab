package com.Practice;

import java.util.Scanner;

class BankDetails{

private String Accno;
private  String name;
private  String acc_type;
private  long balance;

Scanner sc=new Scanner(System.in);

public void openAccount() {
	System.out.println("enter accno");
	Accno=sc.next();
	System.out.println("enter acc type");
	acc_type=sc.next();
	System.out.println("enter name");
	name=sc.next();
	System.out.println("enter balance");
	balance=sc.nextLong();
	System.out.println();
	}
public void showAccount() {
	System.out.println(name);
	System.out.println(Accno);
	System.out.println(acc_type);
	System.out.println(balance);
	}
public void deposite() {
	long amt;
	System.out.println("enter deposite amount");
	amt=sc.nextLong();
	balance=balance +amt;
	}
public void withdrawal() {
	long amt;
	System.out.println("balance after withdrawal");
	amt=sc.nextLong();
	if(balance >=amt) {
		balance =balance-amt;
		System.out.println("balance after withdrwal"+ balance);
	}else {
		System.out.println(amt);
	}
}
public boolean search(String ac_no) {
	if(Accno.equals(ac_no)) {
		showAccount();
		return(true);
		}
return (false);
}
}
public class Banking_Application {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("how many cutomers wants inputs");
		int n=sc.nextInt();
		BankDetails c[]=new  BankDetails[n];
	for(int i=0;i<c.length;i++) {
		c[i]=new BankDetails();
		c[i].openAccount();
		
	}
	int ch;
	do {
		System.out.println("\n*** banking system application");
		System.out.println("1.diplay all account\n serch account \n3.deposite\n4.withdraw\n.5.exit");
		
	System.out.println("enter choice");
	ch=sc.nextInt();
	switch (ch) {
	case 1:
		for(int i=0;i<c.length; i++) {
		c[i].showAccount();
		}
		break;
	case 2:
		System.out.println("enter acc no");
		String ac_no=sc.next();
		boolean found =false;
		for(int i=0;i<c.length;i++) {
			found=c[i].search(ac_no);
			if(found) {
				break;
				
			}
		}
	if(!found) {
		System.out.println("serch failed account...!!");
	}
	break;
	case 3:
		System.out.println("enter acc no");
		ac_no=sc.next();
		found=false;
		for(int i=0;i<c.length;i++) {
			found=c[i].search(ac_no);
			if(found) {
				c[i].deposite();
				break;
				
			}
	
	}
		if(!found) {
			System.out.println("sech failed acc doesnt exit");
		
		}
		break;
		
	case 4:
		System.out.println("enter acc no");
		ac_no=sc.next();
		found =false;
		for(int i=0;i<c.length;i++) {
			found =c[i].search(ac_no);
			if(found) {
				c[i].withdrawal();
				break;
				
			}
		}
           if(found) {
        	   System.out.println("see failed acc");
        	   
           }
           break;
	case 5:
		System.out.println("see you soon");
		break;
	}
	}
	while(ch !=5);
	
	}
	}


