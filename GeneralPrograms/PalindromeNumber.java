package generalProgram;

import java.util.Scanner;

public class PalindromeNumber {
	
public static void main(String[]args) {
		
		int a,n,c=0,b;
		System.out.println("Enter any integer number =");
		Scanner obj = new Scanner(System.in);
		a=obj.nextInt();
		b=a;
		while(a>0) {
			
			n=a%10;
			c=(c*10)+n;
			System.out.print(n);
			a=a/10;
			
		}
		System.out.println();
		if(b==c) {
			
			System.out.println("Given Number is Palindrome");
			
			
		}
		else {
			
			System.out.println("Given Number is not Palindrome");
		}
		
		}

}
