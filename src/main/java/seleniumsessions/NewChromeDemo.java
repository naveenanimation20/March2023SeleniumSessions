package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NewChromeDemo {
	public static void main(String[] args) {			
		System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Downloads/chromedriver-mac-x64/chromedriver");//115.exe
		ChromeOptions co = new ChromeOptions();
		co.setBinary("/Users/naveenautomationlabs/Downloads/chrome-mac-x64/Google Chrome for Testing.app/Contents/MacOS/Google Chrome for Testing");
		WebDriver driver = new ChromeDriver(co);//browser - 115
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Naveen Automation Labs");
	}

}
