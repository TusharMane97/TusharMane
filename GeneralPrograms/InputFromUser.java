package generalProgram;

import java.util.Scanner;

public class InputFromUser {
	public static void main(String[]args) {
		
		int a,b;
		System.out.println("Enter the value of a for the addition ");
		Scanner obj = new Scanner(System.in);
		a=obj.nextInt();
		System.out.println("Enter the value of b for the addition");
		b=obj.nextInt();
		System.out.println("Sum of "+a+" and "+b+" is "+(a+b));
	}

}
