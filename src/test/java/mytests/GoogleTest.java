package mytests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

	// AAA rule: (Arrange-Act-Assert) - 1 test - 1 assert

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

}

