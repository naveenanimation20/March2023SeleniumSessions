package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {

		// Alert - JS PopUp /Modal Dialog
		// 1. alert 2.prompt 3.confirm

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		
		//1. alert:
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		Thread.sleep(2000);
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
//		alert.accept(); //accept the alert
		//alert.dismiss(); //NoAlertPresentException: no such alert
		

		//2. confirm:
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		Thread.sleep(2000);
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
//		alert.accept();
		
		//3. prompt:
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		Thread.sleep(2000);
		alert.sendKeys("TestAutomation");
		alert.accept();
		Thread.sleep(2000);
		String mesg = driver.findElement(By.id("result")).getText();
		System.out.println(mesg);
		//You entered: TestAutomation

		String actText = mesg.split(":")[1].trim();
		System.out.println(actText);
		
	}

}
