package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	static WebDriver driver;
	public static void LaunchBrowser() {
		
		System.setProperty("webdriver.chrome.driver","E:\\jAVAAAAAAAA\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public static void OpenApplicationUrl(String url) {
		driver.get(url);
			}
	public static void getLbl() {
		
		String a = driver.findElement(By.xpath("/html/body/div[1]/label")).getText();
		System.out.println(a);
		driver.findElement(By.cssSelector("input[id='123']")).sendKeys("Tushar");
		String b = driver.findElement(By.xpath("/html/body/label")).getText();
		System.out.println(b);
		driver.findElement(By.cssSelector("input[id='456']")).sendKeys("123456");
		String c = driver.findElement(By.xpath("/html/body/div[2]/label")).getText();
		System.out.println(c);
		driver.findElement(By.cssSelector("input[id='789']")).sendKeys("0000");
		//unable to find xpath for submit button
		
	}

	public static void main(String[]args) {
		LaunchBrowser();
		OpenApplicationUrl("file:///E:/jAVAAAAAAAA/Loginpage.html");
		getLbl();
		
	}
}
