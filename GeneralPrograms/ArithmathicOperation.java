package generalProgram;

import java.util.Scanner;

public class ArithmathicOperation {
	
	public static void main(String[]args) {

	int a,b;
	System.out.println("Enter the value of a ");
	Scanner obj = new Scanner(System.in);
	a=obj.nextInt();
	System.out.println("Enter the value of b ");
	b=obj.nextInt();
	System.out.println("Addition "+(a+b));
	System.out.println("Subtraction "+(a-b));
	System.out.println("Multiplication "+(a*b));
	System.out.println("Division "+(a/b));
	System.out.println("remainder "+(a%b));
	
	}
}
