package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckPresenceOfElementConcept {
	static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		By username = By.name("username11");
		By password = By.name("password");
		By loginBtn = By.xpath("//button[@type='submit']");
		By forgotPwdLink = By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']");
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement username_ele = wait.until(ExpectedConditions.presenceOfElementLocated(username));
//		username_ele.sendKeys("admin");
		
		
		
		
		waitForElementPresence(username, 10).sendKeys("admin");
		driver.findElement(password).sendKeys("admin");
		driver.findElement(loginBtn).click();
		
		//waitForElementPresence(forgotPwdLink, 5).click();
		waitForElementVisible(forgotPwdLink, 5).click();
	}
	
	/**
	 * An expectation for checking that an element is present on the DOM of a page. 
	 * This does not necessarily mean that the element is visible.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static WebElement waitForElementPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	/**
	 * An expectation for checking that an element is present on the DOM of a page and visible.
	 *  Visibility means that the element is not only displayed 
	 *  but also has a height and width that is greater than 0.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static WebElement waitForElementVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	

}
