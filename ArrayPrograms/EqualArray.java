package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArray {
	public static void main(String[]args) {
		int a[] = new int [5];
		int b[] = new int [5];
		Scanner r = new Scanner(System.in);
		System.out.println("Enter data in first array");
		for(int i=0;i<a.length;i++) {
			
			a[i]=r.nextInt();
		
		}
		System.out.println("Enter data in second array");
		for(int i=0;i<b.length;i++) {
			
			b[i]=r.nextInt();
		}
		boolean T =Arrays.equals(a, b);
		System.out.println("Both the arrays are same ="+T);
		
		}	
	
}
