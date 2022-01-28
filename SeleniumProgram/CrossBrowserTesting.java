package seleniumProgram;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
static WebDriver driver;
	
	@Parameters("browserName")
	@Test
	public static void launchBrowser(String browserName) {

		switch(browserName.trim().toUpperCase()) {
		case "CHROME":
			System.setProperty("webdriver.chrome.driver", "F:\\jAVAAAAAAAA\\chromedriver.exe");
			driver = new ChromeDriver();
		break;
		case "IE":
			System.setProperty("webdriver.ie.driver", "D:\\Selenium\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		break;
		case "FIREFOX":
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
		break;
		default:
			System.out.println("Invalid Browser Name");
			Assert.fail("Invalid Browser Name");
		break;
	}
		
	driver.manage().window().maximize();
	}	
		public static void main(String args[]) {
			
			launchBrowser("chrome");
		}

	

}
