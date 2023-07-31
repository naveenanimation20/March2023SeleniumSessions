package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownWithoutSelectMethods {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		//drop down: <select> tag
		//Select Class
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		Thread.sleep(4000);
		
		By country = By.id("Form_getForm_Country");
		
		//dont use 3 methods: value, index, visibletext
		
		doSelectDropDownValue(country, "Brazil");
		
		Thread.sleep(3000);
		
		doSelectDropDownValue(country, "India");

		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectDropDownValue(By locator, String dropDownValue) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		
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
