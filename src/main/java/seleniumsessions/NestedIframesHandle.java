package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframesHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();//browser - chrome

		//page
		driver.get("https://selectorshub.com/iframe-scenario/");//page
		Thread.sleep(2000);
		
		//f1
		driver.switchTo().frame("pact1");
		driver.findElement(By.id("inp_val")).sendKeys("first crush");
		
		//f2
		driver.switchTo().frame("pact2");
		driver.findElement(By.id("jex")).sendKeys("current crush");
		
		//f3
		driver.switchTo().frame("pact3");
		driver.findElement(By.id("glaf")).sendKeys("destiny crush");
		
		
		//driver.switchTo().frame("pact2");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("jex")).sendKeys("current crush - NEW");
		
		
		//cant switch from f3 to f1
//		driver.switchTo().frame("pact1");
//		driver.findElement(By.id("inp_val")).sendKeys(" back to first crush");

		
		
		
//		//pact2
//		driver.switchTo().parentFrame();//sel 4.x
//		driver.findElement(By.id("jex")).sendKeys("crush 2 - updated");
//		
//		//pact1
//		driver.switchTo().parentFrame();//sel 4.x
//		driver.findElement(By.id("inp_val")).sendKeys("first crush - updated");
		
		//back to page/browser context:
		//driver.switchTo().parentFrame();
		
//		driver.switchTo().defaultContent();
//		//driver.findElement(By.id("inp_val")).sendKeys("first crush --- Automation");
//
//		String h3Text = driver.findElement(By.tagName("h3")).getText();
//		System.out.println(h3Text);
		
		
		
		
		


	}

}
