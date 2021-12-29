package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
	public static void main(String[]args) {
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
		Arrays.sort(a);
		System.out.println("Sorted array is");
		for(int i=0;i<a.length;i++) {
			
			System.out.println(a[i]);
		}


}}
