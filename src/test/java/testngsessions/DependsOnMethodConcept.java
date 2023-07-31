package testngsessions;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {
	
	
	@Test()
	public void loginTest() {
		System.out.println("login to app");
		int i = 9/0;
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void appSearchTest() {
		//login()
		System.out.println("searchTest");
	}
	
	@Test(dependsOnMethods = "appSearchTest")
	public void selectProductTest() {
		//login()
		//search()
		System.out.println("selectProductTest");
	}
	
	//CRUD - ADD/GET/Update/Delete
	
	//login--> homepage--> search --> cart ---> payment -- test
	//login--> homepage--> search2 --> cart ---> payment -- test

	
	

}
