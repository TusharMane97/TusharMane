package generalProgram;

import java.util.Scanner;

public class ASCII {
	public static void main(String[]args) {
		
		char ch;
		System.out.println("Enter the character");
		Scanner obj = new Scanner(System.in);
		ch=obj.next().charAt(0);
		int a = ch;
		System.out.println("ASCII value of "+ch+" is" +a);
	}

}
