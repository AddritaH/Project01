package pages;

import org.openqa.selenium.By;

import base.Base;

public class Max_Min_PriceCheckBox extends Base{
	
	public void test1_URL() {
		navigateURL("https://www.target.com/");
	}
	
	public void sendKeysOnSearchBox() {
		sendKeys(By.xpath("//input[@type='search']"), "Floor Lamp");
	}
	
	public void clickOnSearchButton() {
		click(By.xpath("//button[@type='submit']"));
	}
	
	public void clickOnPrice() {
		click(By.xpath("//div[2]/div/div[2]/button"));
	}
	
	public void minPriceBox() {
		sendKeys(By.xpath("//div[11]/div[1]/div/input"),"10"); //
	}

	public void maxPriceBox() {
		sendKeys(By.xpath("//div[11]/div[2]/div/input"), "80");
	}
	
	public void clickUpdate() {
		click(By.xpath("//div[3]/button[2]"));
	}
	
}//class
