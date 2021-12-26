package generalProgram;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[]args) {
		
		int a,result=1; 
		System.out.println("Enter the Number of which you want a factorial result");
		Scanner obj = new Scanner (System.in);
		a=obj.nextInt();
		for (int i=1; i<=a; i++) {
			
			result=result*i;
		}
		System.out.println(result);
		
	}

}
