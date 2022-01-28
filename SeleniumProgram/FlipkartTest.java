package seleniumProgram;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTest {

		
		static WebDriver driver;

		public static void launchBrowser() {

			System.setProperty("webdriver.chrome.driver", "F:\\jAVAAAAAAAA\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		public static void manageOperation() {
			driver.manage().window().maximize();
		}

		public static void openApplicationUrl(String url) {
			driver.get(url);
		}
		
		public static void testFlipkart() {
			
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Oneplus Earbuds");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			driver.findElement(By.xpath("//img[contains(@alt,'OnePlus Buds Z Bluetooth Headset')]")).click();
		
			Set<String> handles = driver.getWindowHandles();
			System.out.println(handles);
			Iterator<String> itr = handles.iterator();

			while (itr.hasNext()) {
				driver.switchTo().window(itr.next());
			}
			
			driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2U9uOA _3v1-ww')]")).click();
			
		
		}
		public static void main(String[] args) {
			launchBrowser();
			manageOperation();
			openApplicationUrl("https://www.flipkart.com/");
			testFlipkart();
		}



	}



