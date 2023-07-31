package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {

		//open the browser - chrome
		//ChromeDriver driver = new ChromeDriver();//1
		
		//FirefoxDriver driver = new FirefoxDriver();
		
		//EdgeDriver driver = new EdgeDriver();
		
		//SafariDriver driver = new SafariDriver();
		
		WebDriver driver = new ChromeDriver();
		
		//enter the url:
		driver.get("https://www.google.com");
		
		//get the title:
		String title = driver.getTitle();
		System.out.println("act title: " + title);
		
		//verify the title: act vs exp result: checkpoint/verification point
		if(title.equals("Google")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("in-correct title");
		}
		
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getPageSource());
				
		
		//automation testing --> automation steps + checkpoint(verification)(act vs exp)
		
		driver.quit();//close the browser
	}

}
