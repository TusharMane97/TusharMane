package generalProgram;

import java.util.Scanner;

public class Average {

	public static void main(String[]args) {
		
		int a,b,c,d,e,Sum;
		System.out.println("Enter the marks obtained in five subjects");
		Scanner obj=new Scanner(System.in);
		a=obj.nextInt(); 
		b=obj.nextInt();
		c=obj.nextInt();
		d=obj.nextInt();
		e=obj.nextInt();
		Sum = a+b+c+d+e;
		System.out.println("The Sum of all five subjects marks are "+Sum);
		double Avg=Sum/5.0;
		System.out.println("The average of all five subjects marks are "+Avg);
	}
}
