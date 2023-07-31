package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendKeysAndClick {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//input[@value='Login']");

		
		Actions act = new Actions(driver);
		act.sendKeys(driver.findElement(emailId), "test@gmail.com").perform();
		act.sendKeys(driver.findElement(password), "test@123").perform();
		act.click(driver.findElement(loginBtn)).perform();
	
//		Equivalent to calling: Actions.click(element).sendKeys(keysToSend).
//		This method is different from WebElement.sendKeys(CharSequence) - 
//		see sendKeys(CharSequence) for details how.

		
//		Clicks in the middle of the given element. 
//		Equivalent to: Actions.moveToElement(onElement).click()

	
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
	}
	
	public static void doActionsSendKeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).perform();
	}
	
	
	

}

