package generalProgram;

import java.util.Scanner;

public class NaturalNumber {
	
	public static void main(String[]args) {
		
		int a;
		System.out.println("Enter the number up to which you want natural number");
		Scanner n = new Scanner(System.in);
		a=n.nextInt();
		for (int i=1;i<=a;i++)
		{
			
			System.out.print(" "+i);
		}
	}

}
