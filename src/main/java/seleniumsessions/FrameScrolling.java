package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameScrolling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://help.eclipse.org/latest/index.jsp?topic=%2Forg.eclipse.jdt.doc.user%2Freference%2Fref-java-editor-quickassist.htm");
		Thread.sleep(4000);

		driver.switchTo().frame("HelpFrame");
		//driver.switchTo().frame("ContentFrame");
		driver.switchTo().frame(driver.findElement(By.xpath("//frameset[@id='helpFrameset']/frame[@name='ContentFrame']")));
		Thread.sleep(2000);

		driver.switchTo().frame(driver.findElement(By.xpath("//frameset[@id='contentFrameset']/frame[@name='ContentViewFrame']")));
		
		driver.findElement(By.xpath("//table[@summary='List of quick assists']")).sendKeys(Keys.PAGE_DOWN);

		Thread.sleep(4000);

//		Actions act = new Actions(driver);
//		act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).build().perform();
//		Thread.sleep(1000);
//		act.sendKeys(Keys.COMMAND).sendKeys(Keys.HOME).build().perform();
//		Thread.sleep(1000);
//		act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).build().perform();

	}

}
