package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyPaste {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		WebElement targetElement = driver.findElement(By.id("input-firstname"));
		targetElement.sendKeys("Naveen");

		Actions actions = new Actions(driver);

		actions.keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND).build().perform();

		actions.keyDown(Keys.COMMAND).sendKeys("c").keyUp(Keys.COMMAND).build().perform();
		
		actions.sendKeys(Keys.TAB).build().perform();

		actions.keyDown(Keys.COMMAND).sendKeys("v").keyUp(Keys.COMMAND).build().perform();
		
		actions.sendKeys(Keys.TAB).build().perform();

		actions.keyDown(Keys.COMMAND).sendKeys("v").keyUp(Keys.COMMAND).build().perform();
		
		actions.keyDown(driver.findElement(By.id("input-password")), Keys.COMMAND).sendKeys("v").keyUp(Keys.COMMAND).build().perform();

	}

}
