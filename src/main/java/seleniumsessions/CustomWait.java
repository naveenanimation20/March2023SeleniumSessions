package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By email = By.id("input-email11");

		// 1 - 4 - 6 - 8
		// while loop
		
		retryingElement(email, 10, 2000).sendKeys("naveen");
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static WebElement retryingElement(By locator, int timeOut) {

		WebElement element = null;
		int attempts = 0;

		while (attempts < timeOut) {//10
			try {
				element = getElement(locator);
				System.out.println("element is found...." + locator + " in attempt " + attempts);
				break;

			} catch (NoSuchElementException e) {
				System.out.println("element is not found...." + locator + " in attempt " + attempts);
				try {
					Thread.sleep(500);//default polling time = 500 ms
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}	
			}
			attempts++;

		}

		if (element == null) {
			System.out.println("element is not found...." + locator + " in attempt " + attempts);
		}

		return element;

	}
	
	
	public static WebElement retryingElement(By locator, int timeOut, long pollingTime) {

		WebElement element = null;
		int attempts = 0;

		while (attempts < timeOut) {//10
			try {
				element = getElement(locator);
				System.out.println("element is found...." + locator + " in attempt " + attempts);
				break;

			} catch (NoSuchElementException e) {
				System.out.println("element is not found...." + locator + " in attempt " + attempts);
				try {
					Thread.sleep(pollingTime);//default polling time = custom value
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}	
			}
			attempts++;

		}

		if (element == null) {
			System.out.println("element is not found...." + locator + " in attempt " + attempts);
		}

		return element;

	}

}
