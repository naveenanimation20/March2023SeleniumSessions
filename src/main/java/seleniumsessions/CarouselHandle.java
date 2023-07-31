package seleniumsessions;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CarouselHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();

		driver.get("https://www.noon.com/uae-en/");
		Thread.sleep(7000);		
		getCarouselItems("Trending deals in electronics");
		
		
	}
	
	public static void getCarouselItems(String sectionName) {
		String xpath = "//h2[text()='"+sectionName+"']//parent::div/../following-sibling::div//div[@data-qa='product-name']";
		String nextXpath = "//h2[text()='"+sectionName+"']//parent::div/../following-sibling::div//div[contains(@class,'swiper-button-next')]";
		
		List<WebElement> recommList = driver.findElements(By.xpath(xpath));
		System.out.println(recommList.size());
		Set<String> prodList = new TreeSet<String>();
		while(!driver.findElement(By.xpath(nextXpath)).getAttribute("class").contains("swiper-button-disabled")) {
			//logic for next button
			for(WebElement e : recommList) {
				String text = e.getText();
					if(!text.isEmpty()) {
						prodList.add(text);
					}
			}
			//click on next:
			driver.findElement(By.xpath(nextXpath)).click();
			recommList = driver.findElements(By.xpath(xpath));
		}
		
		//traverse the prod list:
		for(String e : prodList) {
			System.out.println(e);
		}
	}
	

}
