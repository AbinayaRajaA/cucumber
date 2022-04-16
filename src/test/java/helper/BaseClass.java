package helper;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Robot r;
	public static Select s;
	
public static void launchBrowser() {
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();	 
}
public static void launchFirefox() {
	WebDriverManager.firefoxdriver().setup();
	 driver=new FirefoxDriver();
}
public static void launchEdge() {
	WebDriverManager.edgedriver().setup();
	 driver=new EdgeDriver();	 
}

public static void launchUrl(String url) {
	driver.get(url);
}
public static void getTitle() {
	String title = driver.getTitle();
	System.out.println(title);
}
public static String getUrl() {
	String currentUrl = driver.getCurrentUrl();
    return currentUrl;
}
public static void toClose() {
	driver.quit();
}
public static void maxWindow() {
	driver.manage().window().maximize();
}
public static void getInput(WebElement e,String val) {
    e.sendKeys(val);
}
public static void btnClick(WebElement ref) {
	ref.click();
}
public static void copyText() throws AWTException {
	r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_C);
    r.keyRelease(KeyEvent.VK_CONTROL);
    r.keyRelease(KeyEvent.VK_C);

}
public static void toSelect(WebElement element,String text) {
	s=new Select(element);
	s.selectByVisibleText(text);
}
public static void toWait(int time) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));

}
public static String toGetText(WebElement e) {
	String text = e.getText();
	return text;
}
public static String toGetValue(WebElement e,String value) {
	String attribute = e.getAttribute(value);
	return attribute;

}

public static void toScrollUp(WebElement e) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(false)", e);
}
public static void toScrollDown(WebElement e) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)", e);
}
public static void mouseOver(WebElement e) {
	Actions a=new Actions(driver);
	a.moveToElement(e).perform();
	

}



}
