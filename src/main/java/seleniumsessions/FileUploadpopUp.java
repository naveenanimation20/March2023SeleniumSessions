package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadpopUp {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		//type = file -- 99.99% 
		driver.findElement(By.name("upfile")).sendKeys("/Users/naveenautomationlabs/Documents/PostmanFiles/user.json");
		
		//c:\\
		
		//what id type=file is not availabe?
		//1. ask your dev team to add this attribute
		//2. Robot class -- not recommended -- only for windows. wont work for linux, mac, docker, cloud, jenkins, headless, grid
		//3. autoIt -- not recommended -- only for windows. wont work for linux, mac, docker, cloud, jenkins, headless, grid
		//4. sikuli -- not recommended -- coz its based image 
		
		
		//adv pop ups -- QA/STAGE/DEV/UAT -- no adv pop ups
		//only for PROD
		//no need to use switch to alert
		//random pop up -- should we automate this? -- never automate
		
		
		//browser window popup
		
		
		
	}

}
