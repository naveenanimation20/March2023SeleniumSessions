package seleniumsessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleWithList {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();// Browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");// w1
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();// w2

		// 1. fetching window IDs:
		Set<String> handles = driver.getWindowHandles();

		// set to list:
		List<String> handlesList = new ArrayList<String>(handles);

		String parentWindowId = handlesList.get(0);
		String childWindowId = handlesList.get(1);

		// 2. switch work:
		driver.switchTo().window(childWindowId);
		System.out.println("child window url: " + driver.getCurrentUrl());

		// close the child window:
		driver.close();// driver--lost

		// come back to parent window:
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window url: " + driver.getCurrentUrl());

		driver.quit();
		
	}

}
