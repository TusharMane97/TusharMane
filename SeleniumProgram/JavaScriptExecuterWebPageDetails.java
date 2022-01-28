package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExecuterWebPageDetails {
	static WebDriver driver;

	@Test(priority = 0)
	public static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "E:\\jAVAAAAAAAA\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test(priority =1)
	public static void openApplicationUrl() {

		driver.get("https://www.amazon.in/");

	}
	@Test(priority =2)
	public void getData() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//String title = js.executeScript("return document.title").toString();
		//System.out.println("Title : "+title);
		//String domain = js.executeScript("return document.domain").toString();
		//System.out.println("Domain : "+domain);
		//String url = js.executeScript("return document.URL").toString();
		//System.out.println("Url : "+url);
		js.executeScript("document.getElementsByName('field-keywords')[0].value='Toy Car'");
		//js.executeScript("document.getElementById('nav-link-accountList-nav-line-1').click();");
		//js.executeScript("document.getElementById('ap-email').value='xyz@gmail.com'");
		WebElement searchBox = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		js.executeScript("arguments[0].value='Mobile Cover'", searchBox);
		js.executeScript("window.scrollBy(0,800)");
	}
	
	

}
