package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForBrowserWindow {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();//Browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//w1
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();//w2
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		boolean flag = wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		System.out.println(flag);
		
		
	}
	
	
//	public static boolean waitForNumberOfBrowserWindows(int timeOut, int numberOfWindowsToBe) {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
//		return wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//	}
	
	
	
	

}
