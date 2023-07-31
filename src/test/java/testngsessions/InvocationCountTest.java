package testngsessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InvocationCountTest {
	
	
	@Test(invocationCount = 10, priority = 1, expectedExceptions = Exception.class)
	public void searchTest() {
		System.out.println("searchTest");
		Assert.assertEquals("Google", "Google");
	}

	
	
	@Test(priority = 2)
	public void cartTest() {
		System.out.println("cartTest");
		Assert.assertEquals("macbook", "macbook");
	}
}
