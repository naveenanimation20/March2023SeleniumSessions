package mytests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {

	WebDriver driver;
	ChromeOptions co;

	@Parameters({ "browser", "url" , "headless"})
	@BeforeTest
	public void setup(String browserName, String url, String headless) {
		System.out.println("running browser: " + browserName);
		switch (browserName.toLowerCase()) {
		case "chrome":
			co = new ChromeOptions();
			if(Boolean.parseBoolean(headless)) {
				co.addArguments("--headless=new");
			}
			
			driver = new ChromeDriver(co);
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;

		case "edge":
			driver = new EdgeDriver();
			break;

		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("plz pass the right browser.....");
			break;
		}

		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@AfterTest
	public void tearDown() {
		// delete user
		driver.quit();
	}

}
