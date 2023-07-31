package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//sel 3.x
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//sel 4.x
		//imp wait: global wait:
		//its applicable for all the web elements by default
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//login page: 10
		//driver.findElement(By.name("username")).sendKeys("admin");//10-5=5
		//e2 -- 10 -- password -> 10 --> 0
		//e3 -- 10 -- login button--> 10 ---> 0
		//e4 -- 10
		//e100 -- 10
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//sel 4.x
		//homepage: 20
		//he1 -- 20
		//he2 -- 20
		//logout
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//sel 4.x
		//loginpage: 10 secs
		//e2 -- 10
		//e3 -- 10
		//e4 -- 10
		
		//payment page: 0 secs: nullification of imp wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//sel 4.x
		
		
		//un - 10
		//pwd - 5
		//login - 20
		//ele - 0
		//wont work for non web elements: title, url, alert
		
		//logout: loginpage: 10
		//123
		
		driver.quit();
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//sel 4.x
		//payment: 5
		
		


	}

}
