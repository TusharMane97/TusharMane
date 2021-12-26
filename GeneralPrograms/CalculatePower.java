package generalProgram;

import java.util.Scanner;

public class CalculatePower {
	
	public static void main(String[]args){
		
		int a,b,result=1;
		System.out.println("Enter the number");
		Scanner obj = new Scanner(System.in);
		a=obj.nextInt();
		System.out.println("Enter the Power");
		Scanner o = new Scanner(System.in);
		b=o.nextInt();
		for(int i=1;i<=b;i++) {
			
			result=a*result;
		}
		System.out.println(result);
	}

}
