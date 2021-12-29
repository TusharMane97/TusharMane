package arrayPrograms;

import java.util.Scanner;

public class FindArrayElement {
public static void main(String[]args) {
		
		int i,n,count=0;
		int a[] = new int [5];
		
		System.out.println("Enter an array element");
		Scanner r = new Scanner(System.in);
		for(i=0;i<a.length;i++) {
			
			a[i]=r.nextInt();
		
		}
		System.out.println("First array is");
		for(i=0;i<a.length;i++) {
			
			System.out.println(a[i]);
		}
		System.out.println("Enter the element which you want to find");
		n=r.nextInt();
		for(i=0;i<a.length;i++) {
			if(a[i]==n) {
				System.out.println("Entered element "+n+" is present in array");
			}
			
		}
}
}
