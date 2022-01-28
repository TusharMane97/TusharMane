package seleniumProgram;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertHandling {
	
	static WebDriver driver;
	@Test
	public static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "E:\\jAVAAAAAAAA\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test(priority=1)
	public static void manageOperation() {
		driver.manage().window().maximize();
	}
	@Test(priority=2)
	public static void openApplicationUrl() {
		driver.get("http://demo.guru99.com/test/delete_customer.php");
	}
	@Test(priority=3)
	public static void handleAlert() throws InterruptedException {
		
		driver.findElement(By.name("cusid")).sendKeys("1234");
		driver.findElement(By.cssSelector("input[name='submit']")).click();
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		System.out.println("First Alert Text : "+alert.getText());
		alert.accept();
		System.out.println("Second Alert Text : "+alert.getText());
		alert.accept();
		System.out.println("Page Title : "+driver.getTitle());
	}

}
