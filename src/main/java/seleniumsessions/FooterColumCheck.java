package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterColumCheck {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		Thread.sleep(5000);

		System.out.println(getFooterHeaderTest("Blog"));
		System.out.println(getFooterHeaderTest("Amazon Science"));
		System.out.println(getFooterHeaderTest("Careers"));
		System.out.println(getFooterHeaderTest("Shop with Points"));
		System.out.println(getFooterHeaderTest("Help"));

		// a[text()='Amazon Science']/ancestor::ul/parent::div/div
		// a[text()='Amazon Science']/parent::li/parent::ul/parent::div/div
		// a[text()='Amazon Science']/ancestor::ul/preceding-sibling::div
		// a[text()='Blog']/ancestor::div[@class='navFooterLinkCol
		// navAccessibility']/div

	}

	public static String getFooterHeaderTest(String footerText) {

		String footerHeaderText = driver.findElement(By.xpath(
				"//a[text()='" + footerText + "']/ancestor::div[@class='navFooterLinkCol navAccessibility']/div"))
				.getText();

		return footerHeaderText;

	}
	
	
	//id:
//	id="ohrmList_chkSelectRecord_16"
//	id=ohrmList_chkSelectRecord_2
	
			//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']
			//a[text()='Joe.Root']/ancestor::tr//input[@type='checkbox']
	
			//a[text()='Joe.Root']/parent::td/following-sibling::td
	
	
	
	
	

}
