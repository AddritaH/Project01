package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Base {

public static WebDriver driver;
	
	public static void navigateURL(String url) {
		driver.get(url);
	}
	
	public static void sendKeys(By by, String value) {
		driver.findElement(by).sendKeys(value);
	}
	
	public static void click(By by) {
		driver.findElement(by).click();
	}
	
	public static void enter(By by) {
		driver.findElement(by).sendKeys(Keys.RETURN);
	}
}//class
