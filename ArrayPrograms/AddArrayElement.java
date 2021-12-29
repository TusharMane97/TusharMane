package arrayPrograms;

import java.util.Scanner;

public class AddArrayElement {
public static void main(String[]args) {
		
		int i,sum=0;
		int a[] = new int [5];
		Scanner r = new Scanner(System.in);
		System.out.println("Enter an array element");
		for(i=0;i<a.length;i++) {
			
			a[i]=r.nextInt();
		
		}
		System.out.println("First array is");
		for(i=0;i<a.length;i++) {
			
			System.out.println(a[i]);
		}
		System.out.println("Addition of all array element is");
		for(i=0;i<a.length;i++) {
			
			sum=sum+a[i];
		}
		System.out.println(sum);
}

}
