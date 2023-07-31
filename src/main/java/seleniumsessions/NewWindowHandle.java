package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowHandle {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();//Browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//w1

		String parentWindowId = driver.getWindowHandle();
		
		//sel 4.x
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
