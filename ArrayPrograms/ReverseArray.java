package arrayPrograms;

import java.util.Scanner;

public class ReverseArray {
	
	public static void main(String[]args) {
		
		int i;
		
		int a[] = new int [5];
		Scanner r = new Scanner(System.in);
		System.out.println("Enter an array element");
		for(i=0;i<a.length;i++) {
			
			a[i]=r.nextInt();
		
		}
		System.out.println("length of an array "+a.length);
		System.out.println("Reverse array element");
		for(i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
		
	}

}
