package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinksConcpet {
	static WebDriver driver;

	public static void main(String[] args) {

		// open any url
		// get the count of links on the page -- html tag = a
		// print the text of each link on the console
		// but ignore blank text

		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		By links = By.tagName("a1111");
		
		List<WebElement> linksList = driver.findElements(links);
		System.out.println(linksList);//[]
		int linksCount = linksList.size();//0
		System.out.println("total links = " + linksCount);
		
		//1. index based loop:
//		for(int i=0; i<linksCount; i++) {
//			String text = linksList.get(i).getText();
//				if(!text.isEmpty()) {
//					System.out.println(i + ":" + text);
//				}
//		}
		
		//2. for each loop:
//		int count = 0;
//		for(WebElement e : linksList) {
//			String text = e.getText();
//			if(!text.isEmpty()) {
//				System.out.println(count + ":" + text);
//			}
//			count++;
//		}

	}

}
