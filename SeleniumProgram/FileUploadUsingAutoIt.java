package seleniumProgram;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FileUploadUsingAutoIt {
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
		driver.get("https://pdf2doc.com/");
	}
	@Test(priority=3)
	public static void clickUploadFile() {
		driver.findElement(By.xpath("//label[@for='fileSelector']")).click();
		
	}
	@Test(priority=4)
	public static void fileUpload() throws InterruptedException, IOException {
		
		Thread.sleep(5000);
		Runtime.getRuntime().exec("E:\\jAVAAAAAAAA\\AutoIT\\FileUpload.exe");
		
	}
	@Test(priority=5)
	public static void fileDownload() throws InterruptedException {
		Thread.sleep(10000);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("button[class='file-button file__button']"))));
		driver.findElement(By.cssSelector("button[class='file-button file__button']")).click();
		
	}
	

}
