package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MMT {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(5000);
		driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
		
		driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();

	}

}
