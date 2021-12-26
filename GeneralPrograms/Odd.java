package generalProgram;

import java.util.Scanner;

public class Odd {
	

	public static void main(String[]args) {
		
		int a;
		System.out.println("Enter the number up to which you want result");
		Scanner n = new Scanner(System.in);
		a=n.nextInt();
		for (int i=1;i<=a;i++)
		{
			
			if(i%2==0) {
				
				System.out.println("Even Numbers are "+i);
			}
			else {
				System.out.println("Odd Numbers are "+i);
			}
		}
	}

}
