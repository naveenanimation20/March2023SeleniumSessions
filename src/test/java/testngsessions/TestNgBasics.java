package testngsessions;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgBasics {
	
	//global pre condition
	//pre condition
	//test steps + exp vs act --> assertion --> P/F
	//post steps
	
//	BS -- connectWithDB
//	BT -- createUser
//	BC -- launchBrowser
//	
			//	BM -- longToApp
			//	cartTest
			//	AM -- logout
//	
			//	BM -- longToApp
			//	orderTest
			//	AM -- logout
//	
			//	BM -- longToApp
			//	searchTest
			//	AM -- logout
//	
//	AC -- closeBrowser
//	AT -- deleteUser
//	AS -- disconnectWithDB
	
	
	//1
	@BeforeSuite
	public void connectWithDB() {
		System.out.println("BS -- connectWithDB");
	}
	
	//2
	@BeforeTest
	public void createUser() {
		System.out.println("BT -- createUser");
	}
	
	//3
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC -- launchBrowser");
	}
	
	//4 7 10
	@BeforeMethod
	public void longToApp() {
		System.out.println("BM -- longToApp");
	}
	
	//11
	@Test
	public void searchTest() {
		System.out.println("searchTest");
		Assert.assertEquals("Google", "Google1");
	}
	
	//5
	@Test
	public void cartTest() {
		System.out.println("cartTest");
		Assert.assertEquals("macbook", "macbook");
	}
	
	//8
	@Test
	public void orderTest() {
		System.out.println("orderTest");
		Assert.assertEquals(1000, 1000);
	}
	
	//6 9 12
	@AfterMethod
	public void logout() {
		System.out.println("AM -- logout");
	}
	
	//13
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC -- closeBrowser");
	}
	
	//14
	@AfterTest
	public void deleteUser() {
		System.out.println("AT -- deleteUser");
	}
	
	//15
	@AfterSuite
	public void disconnectWithDB() {
		System.out.println("AS -- disconnectWithDB");
	}
	
	
	

}
