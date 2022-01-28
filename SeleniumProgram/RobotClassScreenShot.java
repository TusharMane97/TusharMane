package seleniumProgram;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RobotClassScreenShot {
	
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
	@Test(priority=1)
	public static void openApplicationUrl() {
		driver.get("https://www.amazon.in");
	}
	@Test(priority=2)
	public static void screenshotUsingRobot() throws AWTException {
		
		Robot robot = new Robot();
		//Rectangle rect = new Rectangle(new Dimension(700,300));
		BufferedImage srcImg = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		File dest = new File("G:\\PF\\BasicCoreJava\\ScreenShots\\RobotScreenShotFullScreen.png");
		try {
			ImageIO.write(srcImg, "png", dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
