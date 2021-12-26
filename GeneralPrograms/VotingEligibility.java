package generalProgram;

import java.util.Scanner;

public class VotingEligibility {
	
public static void main(String[]args) {
		
		int a; 
		System.out.println("Enter you age");
		Scanner obj = new Scanner (System.in);
		a=obj.nextInt();
		if(a>=18) {
			System.out.println("You are eligibel for voting");
		}else {
		System.out.println("You are not eligible for voting");
		}
		}

}
