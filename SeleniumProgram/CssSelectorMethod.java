package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorMethod {
	static WebDriver driver;
	public static void LaunchBrowser() {
		
		System.setProperty("webdriver.chrome.driver","E:\\jAVAAAAAAAA\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public static void OpenApplicationUrl(String url) {
		
		driver.get(url);
			}
	
	public static void handleWebElement(){
		String product = "Laptop Bags";
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		WebElement searchBar = driver.findElement(By.cssSelector("input[name='q']"));
		String placeholder = searchBar.getAttribute("placeholder");
		System.out.println("Actual Placeholder ="+placeholder);
		
		searchBar.sendKeys(product);
		String attributeValue = searchBar.getAttribute("value");
		System.out.println("Value ="+attributeValue);
		String fontFamily = searchBar.getCssValue("font-family");
		System.out.println("Font Family ="+fontFamily);
		
		System.out.println(driver.findElement(By.cssSelector("a[class='_1_3w1N']")).getText());
		boolean result=false;
		try {
			result= driver.findElement(By.cssSelector("a[class='_1_3w1N']")).isDisplayed();
		}catch(RuntimeException e) {
			
		}
		System.out.println(result);
	}
	public static void main(String[]args) {
		
		LaunchBrowser();
		OpenApplicationUrl("https://www.flipkart.com");
		handleWebElement();
	}
}


