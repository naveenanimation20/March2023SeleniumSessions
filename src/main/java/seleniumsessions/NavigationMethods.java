package seleniumsessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws MalformedURLException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		//driver.navigate().to("https://www.google.com");
		driver.navigate().to(new URL("https://www.amazon.com"));

		System.out.println(driver.getTitle());
		
//		driver.get("https://www.amazon.com");
//		System.out.println(driver.getTitle());

		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());

		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
		
		
	}

}
