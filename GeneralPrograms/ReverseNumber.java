package generalProgram;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[]args) {
		
		int a,n;
		System.out.println("Enter any integer number =");
		Scanner obj = new Scanner(System.in);
		a=obj.nextInt();
		while(a>0) {
			
			n=a%10;
			System.out.print(n);
			a=a/10;
		}
		
		
		
	}

}
