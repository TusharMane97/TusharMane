package generalProgram;

import java.util.Scanner;

public class MultiplicationTable {
public static void main(String[]args) {
		
		int a,result=1; 
		System.out.println("Enter any number");
		Scanner obj = new Scanner (System.in);
		a=obj.nextInt();
		for(int i=1;i<=10;i++) {
			
			result=a*i;
			System.out.println(result);
		}
}
}
