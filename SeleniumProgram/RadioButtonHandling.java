package seleniumProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButtonHandling {
	
	static WebDriver driver;

	public static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "E:\\jAVAAAAAAAA\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void manageOperation() {
		driver.manage().window().maximize();
	}

	public static void openApplicationUrl(String url) {
		driver.get(url);
		
	}
	public static void handleRadioButton() {
		
		List<WebElement> ele =driver.findElements(By.cssSelector("label[class='custom-control-label']"));
		for(WebElement btn : ele) {
			
			if (btn.getText().equals("Yes")) {
				btn.click();
			}
		}
	}

	@Test
	public void run() {
		 launchBrowser();
		 manageOperation();
		 openApplicationUrl("https://demoqa.com/radio-button");
		 handleRadioButton();
		 
	}
}
	


