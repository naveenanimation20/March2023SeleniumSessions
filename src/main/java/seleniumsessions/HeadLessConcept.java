package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessConcept {

	public static void main(String[] args) {

		//headless: No browser
		//invisible browser//without UI
		//testing happening behind the scene
		//faster than the normal
		//when to use? Linux OS, Jenkins, Docker, NON UI
		//might not work for complex html, navigations, responsive testing: 
		
		ChromeOptions co = new ChromeOptions();
		co.setHeadless(true);
		co.addArguments("--headless");
		
		FirefoxOptions fo = new FirefoxOptions();
		fo.addArguments("--headless");
		
//		Deprecated. Use addArguments(String). 
//		Recommended to use '--headless=chrome' as argument for browsers v94-108. 
//		Recommended to use '--headless=new' as argument for browsers v109+.
//		Example: `addArguments("--headless=new")`.

		
		//WebDriver driver = new ChromeDriver(co);
		WebDriver driver = new FirefoxDriver(fo);
		driver.get("https://www.amazon.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
		//edge -- headless
		//safari -- no support for headless
		
		
	}

}
