package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSignUp {
	static WebDriver driver;
	public static void LaunchBrowser() {
		
		System.setProperty("webdriver.chrome.driver","E:\\jAVAAAAAAAA\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public static void OpenApplicationUrl(String url) {
		
		driver.get(url);
			}
	public static void handleElement(){
		driver.findElement(By.cssSelector("a[class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Tushar");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Mane");
	    driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("tusharmane205@gmail.com");
	    driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']")).sendKeys("tusharmane205@gmail.com");
	    driver.findElement(By.cssSelector("input[name='reg_passwd__']")).sendKeys("123456");
	    driver.findElement(By.cssSelector("select[id='day']")).sendKeys("23");
	    driver.findElement(By.cssSelector("select[id='month']")).sendKeys("April");
	    driver.findElement(By.cssSelector("select[id='year']")).sendKeys("1997");
	    driver.findElement(By.cssSelector("input[value='2']")).click();
	    
	}
	

	public static void main(String[]args) {
		
		LaunchBrowser();
		OpenApplicationUrl("https://www.facebook.com");
		handleElement();
		
	}

}
