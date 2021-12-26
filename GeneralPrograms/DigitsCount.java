package generalProgram;

import java.util.Scanner;

public class DigitsCount {
	
public static void main(String[]args) {
		
		int a,count=0; 
		System.out.println("Enter any digits number");
		Scanner obj = new Scanner (System.in);
		a=obj.nextInt();
		while(a>0) {
			
			a=a/10;
			count++;
			
		}
		
		System.out.println("Number of digits of entered number is "+count);
		}

}
