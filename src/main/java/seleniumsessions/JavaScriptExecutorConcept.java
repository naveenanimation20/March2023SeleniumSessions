package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//inject JS script/code using selenium-Java with JavaScriptExecutor
		
//		RWD --> WD
//		RWD --> JSE -- executeScript()
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		//js.executeScript("alert('hi this is naveen')");
//		String title = js.executeScript("return document.title;").toString();
//		System.out.println(title);
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
//		System.out.println(jsUtil.getTitleByJS());
//		
//		jsUtil.generateJSAlert("hi this is my alert");
//		String pageText = jsUtil.getPageInnerText();
//		System.out.println(pageText);
//		if(pageText.contains("Calls & Voice")) {
//			System.out.println("PASS - Calls & Voice");
//		}
		
//		jsUtil.scrollPageDown();
//		Thread.sleep(1000);
//		jsUtil.scrollPageUp();
//		Thread.sleep(1000);
//		jsUtil.scrollPageDown("800");

//		WebElement element = driver.findElement(By.xpath("//span[text()='International top sellers']"));
//		//jsUtil.scrollIntoView(element);
//		
//		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
//		jsUtil.drawBorder(search);
//		jsUtil.drawBorder(element);
		
		//WebElement reg_form_ele = driver.findElement(By.cssSelector(".form-horizontal"));
		//jsUtil.drawBorder(reg_form_ele);
		
		WebElement fn = driver.findElement(By.id("input-firstname"));
		WebElement ln = driver.findElement(By.id("input-lastname"));

		jsUtil.flash(fn);
		fn.sendKeys("Naveen");
		jsUtil.flash(ln);
		ln.sendKeys("Testing");

		
	}

}
