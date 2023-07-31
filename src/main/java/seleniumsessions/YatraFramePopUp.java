package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YatraFramePopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();//browser - chrome

		//page
		driver.get("https://www.yatra.com/");//page
		Thread.sleep(5000);
		
		driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
		driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
		
		driver.switchTo().defaultContent();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//button[text()='Ok,I Agree']")).click();

	}

}
