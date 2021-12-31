package seleniumProgram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserLaunch {
	
	static WebDriver driver;
	public static void LaunchBrowser() {
		
		System.setProperty("webdriver.chrome.driver","E:\\jAVAAAAAAAA\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public static void OpenApplicationUrl() {
		
		driver.get("https://www.flipkart.com/");
			}
	public static void  Webinfo() {
		
		String actualTitle = driver.getTitle();
		System.out.println("Title name is ="+actualTitle);
	}
	
	public static void CurrentUrl() {
		
		String url = driver.getCurrentUrl();
		System.out.println("Our current url is ="+url);
	}
	public static void CloseApplication() {
		//driver.close(); close current window
		driver.quit();//close all window tab/discard webdriver object
	}
		
		public static void ManageApplication() {
			
			//driver.manage().window().maximize();
			//driver.manage().window().fullscreen();
			//System.out.println("Size of window before maximize ="+driver.manage().window().getSize());
			//Dimension dim = new Dimension(500, 500);
			//driver.manage().window().setSize(dim);
			//System.out.println("Size of window after maximize ="+driver.manage().window().getSize());
			//Point point = new Point(700, 600);
			//driver.manage().window().setPosition(point);
			//System.out.println("Size of window afer maximize ="+driver.manage().window().getPosition());
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println(driver.manage().getCookies());
			driver.manage().deleteAllCookies();
			System.out.println("After delete method ="+driver.manage().getCookies());
			Cookie cookie = new Cookie("Cookie 1","AMCV_17EB401053DAF4840A490D4C%40AdobeOrg");
			driver.manage().addCookie(cookie);
			System.out.println("After add method ="+driver.manage().getCookies());
			
		}
	
public static void main(String[] args) {
	LaunchBrowser();
	OpenApplicationUrl();
	Webinfo();
	CurrentUrl();
	ManageApplication();
	CloseApplication();
}
}
