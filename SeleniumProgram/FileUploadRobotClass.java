package seleniumProgram;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadRobotClass {
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
	public static void fileUpload() throws AWTException, InterruptedException {
		Thread.sleep(5000);
		StringSelection selection = new StringSelection("C:\\Users\\acer\\Downloads\\akash hande admit card.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Robot robot = new Robot();
		robot.delay(500);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.delay(500);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.delay(500);
		
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_ENTER);
		
	}

}
