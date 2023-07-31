package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageLoadTimeOutConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		if(isPageLoaded(10)) {
			System.out.println("page is fully loaded");
		}
		
	}
	
	
	public static boolean isPageLoaded(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		String flag = wait.until(ExpectedConditions.jsReturnsValue("return document.readyState == 'complete'")).toString();
		return Boolean.parseBoolean(flag);
	}
	
	//loading
	//interactive
	//complete
	
	

}
