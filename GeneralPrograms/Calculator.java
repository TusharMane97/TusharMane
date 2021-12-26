package generalProgram;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[]args) {
		
		int a,b,ch,cal;
		 
		System.out.println("Enter any two numbers");
		Scanner obj = new Scanner(System.in);
		a=obj.nextInt();
		b=obj.nextInt();
		System.out.println("Select the number for  operation to be performed");
		System.out.println("1 for Addition");
		System.out.println("2 for Substraction");
		System.out.println("3 for Multiplication");
		System.out.println("4 for Division");
		ch=obj.nextInt();
		 if(ch==1) {
			cal= a+b;
			System.out.println("addition is "+cal);
		 }
		 else if(ch==2) {
			 cal= a-b;
				System.out.println("substraction is "+cal);
		 }
		 else if(ch==3) {
			 cal= a*b;
				System.out.println("multiplication is "+cal);
		 }
		 else if(ch==4) {
			 cal= a/b;
				System.out.println("division is "+cal);
		 }
		 else {
			 cal= a+b;
				System.out.println("remainder is "+cal);
		 }
	}

}
