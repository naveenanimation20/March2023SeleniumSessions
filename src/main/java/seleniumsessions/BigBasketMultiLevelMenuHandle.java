package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMultiLevelMenuHandle {

	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		Thread.sleep(3000);
		
//		WebElement level1 = driver.findElement(By.xpath("//a[@qa='categoryDD']"));
//		Actions act = new Actions(driver);
//		act.moveToElement(level1).perform();
//		Thread.sleep(1500);
//		
//		WebElement level2 = driver.findElement(By.linkText("Beverages"));
//		act.moveToElement(level2).perform();
//		Thread.sleep(1500);
//		
//		WebElement level3 = driver.findElement(By.linkText("Tea"));
//		act.moveToElement(level3).perform();
//		Thread.sleep(1500);
//		
//		WebElement level4 = driver.findElement(By.linkText("Green Tea"));
//		level4.click();
		
		By level1Locator = By.xpath("//a[@qa='categoryDD']");
		
		//muliLevelMenuHandling(level1Locator, "Beverages", "Tea", "Green Tea");
		muliLevelMenuHandling(level1Locator, "Beauty & Hygiene", "Skin Care", "Eye Care");

	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static WebElement getLinkEleByText(String linkText) {
		return driver.findElement(By.linkText(linkText));
	}
	
	
	public static void muliLevelMenuHandling(By level1Locator, String level2, String level3, String level4) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(level1Locator)).perform();
		Thread.sleep(1500);
		act.moveToElement(getLinkEleByText(level2)).perform();
		Thread.sleep(1500);
		act.moveToElement(getLinkEleByText(level3)).perform();
		Thread.sleep(1500);
		getLinkEleByText(level4).click();

	}
	
	public static void muliLevelMenuHandling(By level1Locator, String level2, String level3) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(level1Locator)).perform();
		Thread.sleep(1500);
		act.moveToElement(getLinkEleByText(level2)).perform();
		Thread.sleep(1500);
		getLinkEleByText(level3).click();
	}
	
	
	
	
	
	
	

}
