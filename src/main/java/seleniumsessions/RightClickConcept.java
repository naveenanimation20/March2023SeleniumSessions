package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		

		//WebElement righClickEle = driver.findElement(By.xpath("//span[text()='right click me']"));
		
//		Actions act = new Actions(driver);
//		
//		act.contextClick(righClickEle).perform();
		
//		List<WebElement> optionsList = 
//				driver.findElements(By.cssSelector("ul.context-menu-list.context-menu-root span"));
//		
//		System.out.println(optionsList.size());
//		
//		for(WebElement e : optionsList) {
//			String text = e.getText();
//			System.out.println(text);
//				if(text.equals("Copy")) {
//					e.click();
//					break;
//				}
//		}
		
		//driver.findElement(By.xpath("//span[text()='Copy']")).click();
		
		
		By contextMenuLocator = By.xpath("//span[text()='right click me']");
		selectRightClickOption(contextMenuLocator, "Quit");
		
		
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	public static void selectRightClickOption(By contextMenuLocator, String optionValue) {
		Actions act = new Actions(driver);
		act.contextClick(getElement(contextMenuLocator)).perform();
		By optionLocator = By.xpath("//*[text()='"+optionValue+"']");
		getElement(optionLocator).click();
		
	}
	
	

}
