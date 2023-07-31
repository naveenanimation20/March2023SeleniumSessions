package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleTest {

	//sel 4.5.0
	//Exception in thread "main" java.lang.IllegalStateException: 
		//The path to the driver executable 
	//The path to the driver executable must be set by the webdriver.chrome.driver system property; 

	public static void main(String[] args) {
		
		//mac:
		System.setProperty("webdriver.gecko.driver", "/Users/naveenautomationlabs/Documents/drivers/geckodriver");
		
		//windows:
		//System.setProperty("webdriver.chrome.driver", "c:\\Users\\naveenautomationlabs\\Documents\\drivers\\chromedriver.exe");

		
		WebDriver driver = new FirefoxDriver();

		// enter the url:
		driver.get("https://www.google.com");

		// get the title:
		String title = driver.getTitle();
		System.out.println("act title: " + title);

	}

}
