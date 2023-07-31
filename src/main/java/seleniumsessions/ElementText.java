package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementText {
	
	 static WebDriver driver;

	public static void main(String[] args) {

		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By registerHeader = By.tagName("h1");
		By forgotPwd = By.linkText("Forgotten Password");
		
//		System.out.println(doElementGetText(registerHeader));
//		System.out.println(doElementGetText(forgotPwd));

		
//		boolean flag = driver.findElement(registerHeader).isDisplayed();
//		System.out.println(flag);
		
		if(checkElementIsDisplayed(registerHeader)) {
			System.out.println("registerHeader is displayed");
			String regHeader = doElementGetText(registerHeader);
				if(regHeader.equals("Register Account")) {
					System.out.println("Register Account -- PASS");
				}else {
					System.out.println("Register Account -- FAIL");
				}
		}
	}
	
	public static boolean checkElementIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	
	
	public static String doElementGetText(By locator) {
		String eleText = getElement(locator).getText();
		System.out.println("Element text is ====>" + eleText);
		return eleText;
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	
	
	

}
