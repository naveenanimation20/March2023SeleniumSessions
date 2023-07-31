package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleTogether {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();//Browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//w1
		Thread.sleep(3000);
		
		String parentWindowId = driver.getWindowHandle();
		
		WebElement twEle = driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		WebElement fbEle = driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		WebElement ytEle = driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
		WebElement liEle = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		
		
		twEle.click();
		fbEle.click();
		ytEle.click();
		liEle.click();
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		while(it.hasNext()) {
			String windowId = it.next();
			driver.switchTo().window(windowId);
			System.out.println(driver.getCurrentUrl());
			Thread.sleep(1500);
			
				if(!windowId.equals(parentWindowId)) {
					driver.close();
				}
			
		}
		
		driver.switchTo().window(parentWindowId);
		System.out.println("parent widnow url : " + driver.getCurrentUrl());
		

	}

}
