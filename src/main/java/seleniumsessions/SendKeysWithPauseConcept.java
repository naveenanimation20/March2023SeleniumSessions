package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysWithPauseConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	
		WebElement fn = driver.findElement(By.id("input-firstname"));
		
		Actions act = new Actions(driver);
		
		String value = "NaveenAutomationLabs";
		
		char ch[] = value.toCharArray();
		
		for(int i=0; i<ch.length; i++) {
			act.sendKeys(fn, String.valueOf(ch[i])+" ").pause(500).perform();
		}
		
		//Keyboard Actions
		
		
		
	}

}
