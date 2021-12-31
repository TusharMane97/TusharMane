package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementUrl {
	static WebDriver driver;
public static void LaunchBrowser() {
		
		System.setProperty("webdriver.chrome.driver","E:\\jAVAAAAAAAA\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public static void OpenApplicationUrl() {
		
		driver.get("https://www.facebook.com");
			}
	public static void FindWebElement() {
		WebElement usernameLbl = driver.findElement(By.name("email"));
		System.out.println(usernameLbl.getText());
		driver.findElement(By.tagName("input")).sendKeys("tusharmane205@gmail.com");
		
	}
	public static void main (String[]args) {
		LaunchBrowser();
		OpenApplicationUrl();
		FindWebElement();
	}
}


