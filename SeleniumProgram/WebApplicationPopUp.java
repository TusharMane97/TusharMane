package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WebApplicationPopUp {
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
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.findElement(By.cssSelector("input[value='admin@yourstore.com']")).clear();
		driver.findElement(By.cssSelector("input[value='admin@yourstore.com']")).sendKeys("admin@yourstore.com");
		driver.findElement(By.xpath("//input[@value='admin']")).clear();
		driver.findElement(By.xpath("//input[@value='admin']")).sendKeys("admin");
		driver.findElement(By.cssSelector("button[class='button-1 login-button']")).click();
	}
	@Test(priority=3)
	public static void handleWebPagePopUp() {
		
		driver.findElement(By.xpath("//ul[@class='nav nav-pills nav-sidebar flex-column nav-legacy']/li[2]/a[1]")).click();
		driver.findElement(By.xpath("//ul[@class='nav nav-treeview']/li[1]/a")).click();
		driver.findElement(By.xpath("//button[@id='delete-selected']")).click();
		driver.findElement(By.xpath("//button[@id='delete-selected-action-confirmation-submit-button']")).click();
	}
	

}
