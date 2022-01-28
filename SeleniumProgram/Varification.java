package seleniumProgram;

import org.testng.asserts.SoftAssert;

public class Varification {
	
	public static void main(String[]args) {
		System.out.println("Statement 1");
		String s = "Java";
		String s1 = "Java";
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(s,s1);
		soft.fail("Failed");
		
		System.out.println("Statement 2");
		
	}
}
