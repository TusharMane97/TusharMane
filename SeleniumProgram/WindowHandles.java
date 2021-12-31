package seleniumProgram;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
	
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

	public static void getWindowHandle() {
 
		String parentHandle = driver.getWindowHandle();
		System.out.println(parentHandle);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		Iterator<String> itr = handles.iterator();

	/*	while (itr.hasNext()) {
			driver.switchTo().window(itr.next());
			
			if (driver.getTitle().contains("Tech")) {
				
			System.out.println("Url = " + driver.getCurrentUrl());
			driver.manage().window().maximize();
			boolean display = driver.findElement(By.xpath("//img[@alt='Tech Mahindra']")).isDisplayed();
			System.out.println("Image is present : "+ display);
			break;
			}
		}
	*/	
	//	driver.switchTo().window(parentHandle);
	//	System.out.println(driver.getTitle());
	}

	public static void takeScreenShot() {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("G:\\PF\\BasicCoreJava\\ScreenShots\\naukri.png");
		
		try {
			FileUtils.copyFile(file, destFile);
		} catch (IOException e) {
			
		}
		
		WebElement element = driver.findElement(By.xpath("//div[@id='top-section-widgets']"));
		File src = element.getScreenshotAs(OutputType.FILE);
		File dest = new File("G:\\PF\\BasicCoreJava\\ScreenShots");
		
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			
		}
	}
		
	public static void main(String[] args) {
		launchBrowser();
		manageOperation();
		openApplicationUrl("https://www.naukri.com/");
		getWindowHandle();
		takeScreenShot();
	}

}


