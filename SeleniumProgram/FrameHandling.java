package seleniumProgram;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FrameHandling {
	static WebDriver driver;
	@Test
	public static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "F:\\jAVAAAAAAAA\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test(priority=1)
	public static void manageOperation() {
		driver.manage().window().maximize();
	}
	@Test(priority=2)
	public static void openApplicationUrl() {
		driver.get("https://demo.guru99.com/test/guru99home/");
	}
	@Test(priority=3)
	public static void handleFrame() {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//h3[text()='Email Submission']"))).perform();
		driver.switchTo().frame("a077aa5e");
		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		
	}

}
