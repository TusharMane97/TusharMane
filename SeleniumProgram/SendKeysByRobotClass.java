package seleniumProgram;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SendKeysByRobotClass {
	
	static WebDriver driver;
	@Test
	public static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "E:\\jAVAAAAAAAA\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public static void manageOperation() {
		driver.manage().window().maximize();
	}
	@Test
	public static void openApplicationUrl() {
		driver.get("https://www.amazon.in");
	}
	@Test(priority=1)
	public static void handleMouseEvent() throws AWTException {
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).click();
		Robot robot = new Robot();
		//robot.keyPress(KeyEvent.VK_M);
		//robot.keyRelease(KeyEvent.VK_M);
		//robot.keyPress(KeyEvent.VK_U);
		//robot.keyRelease(KeyEvent.VK_U);
		//robot.keyPress(KeyEvent.VK_G);
		//robot.keyRelease(KeyEvent.VK_G);
		//driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys(Keys.TAB);
		StringSelection str = new StringSelection("Mugs for men");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_CONTROL);
	}

	}

	
