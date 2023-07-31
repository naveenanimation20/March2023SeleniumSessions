package mytests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTesting {

	// AAA rule: (Arrange-Act-Assert) - 1 test - 1 assert

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test(priority = 1)
	public void googleTitleTest() {
		Assert.assertEquals(driver.getTitle(), "Google");
	}

	@Test(priority = 2)
	public void googleURLTest() {
		Assert.assertTrue(driver.getCurrentUrl().contains("google"));
	}

	@Test(priority = 3)
	public void googleSearchTest() {
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).submit();
		Assert.assertTrue(driver.getTitle().contains("Selenium"));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
