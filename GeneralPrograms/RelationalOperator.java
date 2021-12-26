package generalProgram;

import java.util.Scanner;

public class RelationalOperator {
	
	public static void main(String[]args) {

		int a,b;
		System.out.println("Enter the value of a ");
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the value of b ");
		a=obj.nextInt();// Greater Number
		b=obj.nextInt();// Lesser Number
		System.out.println("True/False "+(a<b));
		System.out.println("True/False "+(a>b));
		System.out.println("True/False "+(a<=b));
		System.out.println("True/False "+(a>=b));
		System.out.println("True/False "+(a==b));
		System.out.println("True/False "+(a!=b));
	}

}
