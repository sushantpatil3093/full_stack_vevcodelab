import java.util.Scanner;

public class Calculatots {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number");
		 double num1=sc.nextDouble();
		 double num2=sc.nextDouble();
		 System.out.println("enter operators(+,-,*,/):");
		
		 char op=sc.next().charAt(0);
		 double o=0;
		 switch (op) {
		 case '+':
			 o=num1+num2;
			 break;
		 case '-':
			 o=num1-num2;
			 break;
		 case '*':
			 o=num1*num2;
			 break;
		 case '/':
			 o=num1/num2;
			 break;
			 default :
			 System.out.println("you enter wrong");
		 }
		 System.out.println("final result");
		 
			 System.out.println();
			 System.out.println(num1 + " " + op +" " +num2+"="+o);
		 }
		 }
		
		
		

	


