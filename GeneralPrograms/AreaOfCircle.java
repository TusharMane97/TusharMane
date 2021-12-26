package generalProgram;

import java.util.Scanner;

public class AreaOfCircle {
	
	public static void main(String[]args) {
		
		double a,pi=3.14,d;
		System.out.println("Enter the value of diameter");
		Scanner obj = new Scanner(System.in);
		d=obj.nextDouble();
		a=pi*d;
		System.out.println("Area of Circle ="+a);
				
	}

}
