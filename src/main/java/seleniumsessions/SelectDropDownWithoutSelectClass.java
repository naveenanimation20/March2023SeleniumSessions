package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDropDownWithoutSelectClass {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		// drop down: <select> tag
		// Select Class

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		Thread.sleep(4000);

		//By countryOptions = By.xpath("//select[@id='Form_getForm_Country']/option");
		By countryOptionsCSS = By.cssSelector("select#Form_getForm_Country > option");
		
		doSelectDropDownValueUsingLocator(countryOptionsCSS, "Brazil");
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectDropDownValueUsingLocator(By locator, String dropDownValue) {
		List<WebElement> optionsList = driver.findElements(locator);		
		for(WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
				if(text.equals(dropDownValue)) {
					e.click();
					break;
				}
		}
	}

}
