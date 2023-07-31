package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login/beta");

		
		//xpath: address of the element in HTM DOM
		//1. absolute xpath: /html/body/div/div/div[2]/ul/li[4]/a
		//2. relative xpath/custom xpath: using attributes, using xpath functions
		
		//htmltag[@attr='value']
		//input[@name='username']
		//button[@type='submit']
		
		//input - 14
		//input[@id] -- 6
		//input[@id='input-firstname'] --1
		//input-firstname -- id -- recommended
		
		//input[@placeholder='Username']
		
		
		//htmltag[@attr1='value' and @attr2='value']
		//input[@name='username' and @placeholder='Username']
		//input[@name='username' and @placeholder='Username' and @class='oxd-input oxd-input--active']
		
		//htmltag[@attr1 and @attr2 and @attr3]
		
		//input[@class and @name and @placeholder] -- 2
		//input[@class='form-control private-form__control login-email']
		
		//By e1 = By.xpath("//input[@class='form-control private-form__control login-email']");//valid
		//By e2 = By.className("login-email");//valid
		//By e3 = By.className("form-control private-form__control login-email");//not valid
		//InvalidSelectorException: Compound class names not permitted
		
		By e4 = By.xpath("//input[contains(@class,'login-email')]");//valid
		
		By e5 = By.xpath("//input[@class='login-email']");//not valid
		
		
		//driver.findElement(e3).sendKeys("test@gmail.com");
		
		//contains() in xpath:
		//htmltag[contains(@attr,'value')]
		//input[contains(@data-test-id,'email-input')]
		//input[contains(@data-test-id,'field')]
		//input[contains(@class,'login-email')]
		
		//long value: 
		//dynamic attributes/ids:
//		<input id = "test_123">
//		<input id = "test_456">
//		<input id = "test_900">

		//input[contains(@id,'test_')]
		
		//contains() with attr1 and attr2 without contains:
		//htmltag[contains(@attr1,'value') and @attr2='value']
		//input[contains(@data-test-id,'email-input') and @type='email']
		//input[@type='email' and contains(@data-test-id,'email-input')]
		//input[@type='email' and contains(@data-test-id,'email-input') and @id='username']
		
		//text() in xpath:
		//htmltag[text()='value']
		//h1[text()='Register Account']
		
		//contains() with text():
		//htmltag[contains(text(),'value')]
		//span[contains(text(),'60,000+ businesses of all sizes')]
		
		//text() with @attr:
		//htmltag[text()='value' and @attr='value']
		//a[text()='Login' and @class='list-group-item']
		
		//text() with contains and attr1 with contains() and attr2 without contains:
		//htmltag[contains(text(),'value') and contains(@attr1,'value') and @attr2='value']
		//a[contains(text(),'Address') and contains(@href,'account/address') and @class='list-group-item']
		
		//index/position in xpath:
		
		// (//input[@class='form-control'])[1]
		// (//input[@class='form-control'])[position()=1]
		
		//By.xpath("(//input[@class='form-control'])[1]");
		
		// (//input[@class='form-control'])[last()]
		
		// (//input[@class='form-control'])[last()-(last()-1)] - 1st element
		// (//input[@class='form-control'])[1]		 -- 1st element
		
		// ((//div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()] -- help
		// ((//div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()-1] - amazon assistant
		
		
		//parent to child:
		//parent/child: direct child
		//parent//child: direct + indirect child 
		
		//select[@id='Form_getForm_Country']/option
		//div[@class='footer-main']//a
		//form//input[@id='username']
		
		//child to parent:
		//backward traversing in xpath: child/..
		//input[@id='username']/../../../../../../../../../../../../../../../../..
			
		//input[@id='username']/parent::div
		//input[@id='username']/..
		//input[@id='username']/ancestor::form
		//option[contains(text(),'Country')]/ancestor::form/parent::div/..
		
		
		//a[text()='Amazon Science']/ancestor::div[@class='navFooterLinkCol navAccessibility']/div
		
	}

}
