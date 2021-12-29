package arrayPrograms;

import java.util.Scanner;

public class AscendingArray {
	public static void main(String[]args) {
		int temp;
		int a[] = new int [5];
		Scanner r = new Scanner(System.in);
		System.out.println("Enter an array element");
		for(int i=0;i<a.length;i++) {
			
			a[i]=r.nextInt();
		
		}
		System.out.println("First array is");
		for(int i=0;i<a.length;i++) {
			
			System.out.println(a[i]);
		}
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
			
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;	
			}
			}
		}
		System.out.println("Array in ascending order");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
