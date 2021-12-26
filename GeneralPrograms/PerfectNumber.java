package generalProgram;

import java.util.Scanner;

public class PerfectNumber {
	
public static void main(String[]args) {
		
		int n,count=0;
		System.out.println("Enter any number =");
		Scanner obj = new Scanner(System.in);
		n = obj.nextInt();
		for(int i=1;i<n;i++) {
		if(n%i==0)	{
			count=count+i;
			
		}
			
		}
		if(count==n) {
			
			System.out.println("Entered Number "+n+" is a Perfect Number");
		}
		else {
			System.out.println("Entered Number "+n+" is not a Perfect Number");
		}
	
	}

}
