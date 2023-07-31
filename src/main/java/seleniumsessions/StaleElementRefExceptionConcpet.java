package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class StaleElementRefExceptionConcpet {
	
	

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");//DOM v1
		
		WebElement username = driver.findElement(By.id("input-email")); //v1
		username.sendKeys("naveen@gmail.com");

		driver.navigate().refresh();//DOM v2
		//back/forward
		
		username = driver.findElement(By.id("input-email"));//v2
				
		username.sendKeys("neha@gmail.com");//e1(v2) --> v2
		//Exception in thread "main" org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found

		
	}

}
