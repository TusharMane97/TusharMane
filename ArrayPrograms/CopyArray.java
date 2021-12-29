package arrayPrograms;

import java.util.Scanner;

public class CopyArray {
public static void main(String[]args) {
		
		int i;
		
		int a[] = new int [5];
		int b[] = new int [5];
		Scanner r = new Scanner(System.in);
		System.out.println("Enter an array element");
		for(i=0;i<a.length;i++) {
			
			a[i]=r.nextInt();
		
		}
		System.out.println("First array is");
		for(i=0;i<a.length;i++) {
			
			System.out.println(a[i]);
		}
		System.out.println("Copied array is");
		for(i=0;i<a.length;i++) {
			b[i]=a[i];
			System.out.println(b[i]);
		}
}
}
