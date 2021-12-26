package generalProgram;

import java.util.Scanner;

public class Swap {
	
	public static void main(String[]args) {
		
		int a,b,temp;
		System.out.println("Enter two values");
		Scanner obj = new Scanner(System.in);
		a=obj.nextInt();
		b=obj.nextInt();
		System.out.println("Before Swapping "+a+" "+b+" ");
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping "+a+" "+b+" ");
	}

}
