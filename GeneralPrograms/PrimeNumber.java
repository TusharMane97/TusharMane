package generalProgram;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[]args) {
		
		int n,count=0;
		System.out.println("Enter any number =");
		Scanner obj = new Scanner(System.in);
		n = obj.nextInt();
		for(int i=1;i<=n;i++) {
		if(n%i==0)	{
			count++;
		}
			
		}
		if(count==2) {
			
			System.out.println("Entered Number "+n+" is a Prime Number");
		}
		else {
			System.out.println("Entered Number "+n+" is not a Prime Number");
		}
	
	}
	
}