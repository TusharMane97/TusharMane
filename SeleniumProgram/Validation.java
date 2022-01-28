package seleniumProgram;

import org.testng.Assert;

public class Validation {
	
	public static void main(String[]args) {
		System.out.println("Statement 1");
		String expected = "Java";
		String actual = "Java";
		Assert.assertEquals(actual,expected);
		System.out.println("Statement 2"); 
		Assert.assertEquals(actual,expected,"String is not matched");
		Assert.assertFalse(false, "Statment 3");
		
		
	}
}
