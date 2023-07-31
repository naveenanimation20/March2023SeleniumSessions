package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();//Browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//w1
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();//w2
		
		//1. fetching window IDs:
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		String parentWindowId = it.next();
		System.out.println("Parent window id: " + parentWindowId);
		
		String childWindowId = it.next();
		System.out.println("Child window id: " + childWindowId);

		//2. switch work:
		driver.switchTo().window(childWindowId);
		System.out.println("child window url: " + driver.getCurrentUrl());
		
		//close the child window:
		driver.close();//driver--lost
		
		//come back to parent window:
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window url: " + driver.getCurrentUrl());

		driver.quit();
		
		
		
	}

}
