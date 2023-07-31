package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSessionConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();//sid = 123

		// enter the url:
		driver.get("https://www.google.com");//123

		// get the title:
		String title = driver.getTitle();//123
		System.out.println("act title: " + title);//Google

		System.out.println(driver.getCurrentUrl());//url//123
		
		//driver.quit();//quit the browser, sid = 123
		driver.close();//123
		//System.out.println(driver.getTitle());//sid=123(invalid)
		//NoSuchSessionException: invalid session id
		
		
		//sid: 123 ---> null -- quit
		//sid: 123 ---> 123 (invalid) - close
		
		driver = new ChromeDriver();//sid = 456
		driver.get("https://www.google.com");//456
		
		System.out.println(driver.getTitle());//456
		
		
		
	}

}
