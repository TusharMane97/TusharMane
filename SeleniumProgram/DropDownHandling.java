package seleniumProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownHandling {
	static WebDriver driver;

	public static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "E:\\jAVAAAAAAAA\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void manageOperation() {
		driver.manage().window().maximize();
	}

	public static void openApplicationUrl() {
		driver.get("https://www.facebook.com");
	}
	public static void openRegistrationForm()  {
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Select select=new Select(driver.findElement(By.xpath("//select[@title='Month']")));
		String month = select.getFirstSelectedOption().getText();
		System.out.println("Default Month "+month);
		select.selectByVisibleText("Apr");
		System.out.println("Selected Month "+select.getFirstSelectedOption().getText());
		List<WebElement> options=select.getOptions();
		for(WebElement option :options)
			System.out.println(option.getText()+" ");
		
	}@Test
	public static void run()  {
		launchBrowser();
		manageOperation();
		openApplicationUrl(); 
		openRegistrationForm();
	}
}
