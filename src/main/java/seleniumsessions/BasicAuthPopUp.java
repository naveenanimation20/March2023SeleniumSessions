package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthPopUp {

	public static void main(String[] args) throws InterruptedException {

		String username = "admin";
		String password = "admin";
		

		WebDriver driver = new ChromeDriver();
		driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		
		//basic auth??
		//username:password --> encoded string
		//btoa("username:password") --> ERQWERQWERQWER!@#$@!#$===
		
		
	}

}
