package generalProgram;

import java.util.Scanner;

public class SumOddEven {
	
	public static void main(String[]args) {
		
		int n,i,add=0,add1=0;
		System.out.println("Enter the number upto which you want a result");
		Scanner obj = new Scanner(System.in);
		n=obj.nextInt();
		for(i=0; i<=n; i=i+2) {
			add=add+i;					
	}
		System.out.println("Addition of all Even Numbers are = "+add);
		for(i=1; i<=n; i=i+2) {
			
			add1=add1+i;
			
		}
		System.out.println("Addition of all Odd Numbers are = "+add1);
		
   }
	
}
