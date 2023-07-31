package seleniumsessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import CustomException.FrameworkException;

/**
 * 
 * @author naveenautomationlabs
 *
 */
public class BrowserUtil {

	private WebDriver driver;//null

	/**
	 * This method is used to initialize the driver on the basis of given browser name.
	 * valid browsers = chrome/firefox/edge/safari
	 * @param browserName
	 */
	public WebDriver launchBrowser(String browserName) {
		System.out.println("browser name is : " + browserName);

		if (browserName == null) {
			System.out.println("browser can not be null");
			throw new FrameworkException("BROWSERCANBENOTNULL");
		}

		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
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
			System.out.println("plz pass the right browser name..." + browserName);
			throw new FrameworkException("NOTVALIDBROWSER");
		}
		return driver;
	}

	/**
	 * 
	 * @param url
	 */
	public void enterUrl(String url) {
		if (url.contains("http")) {
			driver.get(url);
		} else {
			throw new FrameworkException("url should have http(s)");
		}
	}
	
	public void enterUrl(URL url) {
		if (String.valueOf(url).contains("http")) {
			driver.navigate().to(url);
		} else {
			throw new FrameworkException("url should have http(s)");
		}
	}
	

	public String getPageTitle() {
		return driver.getTitle();
	}

	public String getPageURL() {
		return driver.getCurrentUrl();
	}

	public void quitBrowser() {
		driver.quit();
	}

	public void closeBrowser() {
		driver.close();
	}

}
