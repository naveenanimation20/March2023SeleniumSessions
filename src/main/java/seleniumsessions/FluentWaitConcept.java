package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitConcept {
	static WebDriver driver;


		//WebDriverWait --> FluentWait --> Wait (until();)
							//until(){}
							//own methods
		
		
		public static void main(String[] args) {
			driver = new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
			
			By email = By.id("input-email");
			
			waitForElementVisibleWithFluentWait(email, 10, 1).sendKeys("testing");
			
			
	}
		
		
	public static WebElement waitForElementVisibleWithFluentWait(By locator, int timeOut, int pollingTime) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofSeconds(pollingTime))
				.ignoring(NoSuchElementException.class)
				.withMessage("----time out is done...element is not found..." + locator);	

			return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}
	
	public static WebElement waitForElementPresenceWithFluentWait(By locator, int timeOut, int pollingTime) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofSeconds(pollingTime))
				.ignoring(NoSuchElementException.class)
				.withMessage("----time out is done...element is not found..." + locator);	

			return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}
		
	public Alert waitForJSAlertWithFluentWait(int timeOut, int pollingTime) {
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofSeconds(pollingTime))
				.ignoring(NoAlertPresentException.class)
				.withMessage("----time out is done...Js alert is not found...");
		return wait.until(ExpectedConditions.alertIsPresent());
	}	

}
