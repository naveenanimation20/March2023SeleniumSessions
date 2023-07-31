package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefWithFindElements {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");//DOM v1
		
		List<WebElement> footerList = driver.findElements(By.cssSelector("footer a"));//v1
		System.out.println(footerList.size());//16
		
		for(int i=0; i<footerList.size(); i++) {
			footerList.get(i).click();//v3
			driver.navigate().back();//v4
			footerList = driver.findElements(By.cssSelector("footer a"));//v4
		}
		
		
	}

}
