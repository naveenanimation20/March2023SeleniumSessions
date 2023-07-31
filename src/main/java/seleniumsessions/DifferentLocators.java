package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentLocators {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		//1. ID: unique locator (attribute) -- I
		//ele -- naveen
		//ele2 -- selenium
		
		//driver.findElement(By.id("selenium")).sendKeys("naveen@gmail.com");

		
		//2. NAME: can be duplicate, 99% name will be unique (attribute) -- II
		//ele1 -- naveen
		//ele2 -- naveen
		//ele3 -- naveen
		//driver.findElement(By.name("naveen")).sendKeys("naveen@gmail.com");
		
		
		//3. CLASS NAME: can be duplicate and most of the time its duplicate (attribute) --- III
		//driver.findElement(By.className("form-control")).sendKeys("Naveen");
		
		
		//4. Xpath: not an attribute...address of the element in HTML DOM
//		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("naveen");
//		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("automation");
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("test@123");
//		
//		driver.findElement(By.name("agree")).click();
//		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
		
//		By fn_xpath = By.xpath("//*[@id=\"input-firstname\"]");
//		By ln_xpath = By.xpath("//*[@id=\"input-lastname\"]");
//		By password_xpath = By.xpath("//*[@id=\"input-password\"]");
//		By privacyPolicy_xpath = By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
//		By continue_xpath = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
//		
//		doSendKeys(fn_xpath, "NaveenTesting");
//		doSendKeys(ln_xpath, "Automation");
//		doSendKeys(password_xpath, "test@123");
//		doClick(privacyPolicy_xpath);
//		doClick(continue_xpath);
		
		
		//5. CSS SELECTOR: not an attribute
//		driver.findElement(By.cssSelector("#input-firstname")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.cssSelector("#input-telephone")).sendKeys("98989898989");
//		driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary")).click();
		
		
		//6. LinkText: only for links...with the text of the link. 
		//html tag = <a>
		//attributes, linktext
		//driver.findElement(By.linkText("Delivery Information")).click();
//		By deliveryInfoLink = By.linkText("Delivery Information");
//		doClick(deliveryInfoLink);
		
		//7. Partial Link Text: only for links...with the partial text of the link.
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		//Forgotten username
		//Forgotten password
		
		//8. TAG NAME: html tag, not an attribute
		//driver.findElement(By.tagName("input")).sendKeys("naveen");
		String header = driver.findElement(By.tagName("h1")).getText();
		System.out.println(header);	
	}
	
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	
	
	

}
