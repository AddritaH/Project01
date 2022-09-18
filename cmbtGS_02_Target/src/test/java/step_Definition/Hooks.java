package step_Definition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Hooks extends Base{
	
	@Before			//annotation
	public void setup() {
		ChromeOptions option = new ChromeOptions();
		option.setHeadless(false);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		System.out.println(driver);
	}
	
	@After			//annotation
	public void tearDown(Scenario scenario) {
		 try {
				String screenshotName= scenario.getName().replace("", "");
				if(scenario.isFailed()) {
					scenario.log("this is my failure message");
					TakesScreenshot ts = (TakesScreenshot)driver;
					byte[]screenshot = ts.getScreenshotAs(OutputType.BYTES);
					scenario.attach(screenshot, "image/png", screenshotName);
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		driver.close();
	}

}//class
