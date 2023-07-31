package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();//browser - chrome

		//page
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");//page
		Thread.sleep(3000);
		
		//page element
		driver.findElement(By.xpath("//img[@title='Vehicle-Registration-Forms-and-Examples']")).click();
		
		Thread.sleep(2000);
		
		//switch to frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		
		//frame element
		driver.findElement(By.id("RESULT_TextField-8")).sendKeys("Naveen");
		
		//coming back to the main page
		driver.switchTo().defaultContent();
		
		//page element:
		String info = driver.findElement(By.id("tooltip")).getText();
		System.out.println(info);
	}

}
