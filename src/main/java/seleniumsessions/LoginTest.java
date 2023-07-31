package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest {

	public static void main(String[] args) {

		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser("chrome");
		brUtil.enterUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		System.out.println(brUtil.getPageTitle());
		
		By email_id = By.id("input-email");
		By pass_id = By.id("input-password");
		
		ElementUtil eleUtl = new ElementUtil(driver);
		eleUtl.doSendKeys(email_id, "naveen@gmail.com");
		eleUtl.doSendKeys(pass_id, "test@123");
		
		//brUtil.quitBrowser();
		
	}

}
