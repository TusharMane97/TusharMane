package seleniumProgram;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowserWithReturnType {
	
	static WebDriver driver;

	public static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver","F:\\jAVAAAAAAAA\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void openApplicationUrl(String url) {
		driver.get(url);
	
	}

	public static void closeCurrentWindow() {
		driver.close();
	}

	public static void closeBrowser() {
		driver.quit();
	}

	public static String getPageTitle() {
		return driver.getTitle();
	}

	public static String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public static String getPageSource() {
		return driver.getPageSource();
	}

	public static void navigationBackOperation() {
		driver.navigate().back();
		
	}

	public static void navigationForwardOperation() {
		driver.navigate().forward();
		
	}
	public static void clickOnButton(WebElement ele) {
		ele.click();
	}
	public static void clearText(WebElement ele) {
		ele.clear();
	}
	public static void sendKeys(WebElement ele, String value) {
		ele.sendKeys(value);
	}
	public static String getText(WebElement ele) {
		return ele.getText();
		
	}
	public static String getAttribute(WebElement ele, String value) {
		return ele.getAttribute(value);
	}
	public static String getCssValue(WebElement ele, String value) {
		return ele.getCssValue(value);
	}
	public static String getTagName(WebElement ele) {
		return ele.getTagName();
	}
	public static WebElement findElementMethod(By loc) {
		WebElement ele= driver.findElement(loc);
		return ele;
	}
	public static List findElementsMethod(By loc) {
		List <WebElement> ele= driver.findElements(loc);
		return ele;
	}
	public static String getWindowHandleMethod() {
		return driver.getWindowHandle();
	}
	public static Set getWindowHandlesMethod() {
		Set<String> handles=driver.getWindowHandles();
		return handles;
	}
	public static Object titleMethod(String arg, Object...arg1) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 String Title = js.executeScript(arg, arg1).toString();
		 return Title;
	}
	public static Object domainMethod(String arg, Object...arg1) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 String Domain = js.executeScript(arg, arg1).toString();
		 return Domain;
	}
	public static Object urlMethod(String arg, Object...arg1) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 String Url = js.executeScript(arg, arg1).toString();
		 return Url;
	}
	public static Object elementByName(String arg, Object...arg1) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 String Name = js.executeScript(arg, arg1).toString();
		 return Name;
	}
	public static Object elementById(String arg, Object...arg1) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 String Id =  js.executeScript(arg, arg1).toString();
		 return Id;
	}
	
	public static void moveTo(WebElement value) {
		Actions act = new Actions(driver);
		 act.moveToElement(value);
	}
	public static void click() {
		Actions act = new Actions(driver);
		  act.click().perform();
	}
	public static void clickAndHold() {
		Actions act = new Actions(driver);
		act.clickAndHold().perform();
	}
	public static void contextclick() {
		Actions act = new Actions(driver);
		act.contextClick().perform();
	}
	public static void Keydown(CharSequence key) {
		Actions act = new Actions(driver);
		act.keyDown(key);
	}
	public static void Keyup(CharSequence key) {
		Actions act = new Actions(driver);
		act.keyUp(key);
	}
	public static void keypress(int keycode) throws AWTException {
		Robot ro = new Robot();
		ro.keyPress(keycode);
	
	}
	public static void keyrealese(int keycode) throws AWTException {
		Robot ro = new Robot();
		ro.keyRelease(keycode);
	
	}
	public static void deleayTime(int ms) throws AWTException {
		Robot ro = new Robot();
		ro.keyRelease(ms);
	
	}
	public static void visibilityOfText(WebElement ele, String value) {
		Select select = new Select(ele);
		select.selectByVisibleText(value);
	}
	public static void visibilityOfValue(WebElement ele, String value) {
		Select select = new Select(ele);
		select.selectByValue(value);
	}
	public static void visibilityOfIndex(WebElement ele, int value) {
		Select select = new Select(ele);
		select.selectByIndex(value);
	}
	public static void deselectByText(WebElement ele, String value) {
		Select select = new Select(ele);
		select.deselectByVisibleText(value);
	}
	public static void deselectValue(WebElement ele, String value) {
		Select select = new Select(ele);
		select.deselectByValue(value);
	}
	public static void deselectIndex(WebElement ele, int value) {
		Select select = new Select(ele);
		select.deselectByIndex(value);
	}
	public static List<WebElement> getOptionsMethod(WebElement ele) {
		Select select = new Select(ele);
		List <WebElement> list = select.getOptions();
		return list;
	}
	public void alertAcceptMethod() {
		driver.switchTo().alert().accept();
	}
	public void alertDismissMethod() {
		driver.switchTo().alert().dismiss();
	}
	
}
