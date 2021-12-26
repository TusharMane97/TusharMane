package generalProgram;

import java.util.Scanner;

public class AreaOfRectangle {
	
	public static void main(String[]args) {
		
		double a,w,l;
		System.out.println("Enter the value of width=");
		Scanner obj = new Scanner(System.in);
		w=obj.nextDouble();
		System.out.println("Enter the value of length=");
		Scanner obj1 = new Scanner(System.in);
		l=obj1.nextDouble();
		a=w*l;
		System.out.println("Area of rectangle= "+a);
		
	}

}
