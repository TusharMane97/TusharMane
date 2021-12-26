package generalProgram;

import java.util.Scanner;

public class SquareRoot {
	
public static void main(String[]args) {
		
		int a;
		System.out.println("Enter any number =");
		Scanner obj = new Scanner(System.in);
		a=obj.nextInt();
		double n =Math.sqrt(a);
		System.out.println("Square of "+a+" is "+n);

}
}
