package testngsessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	
	String name;
	
	
	
	@Test(expectedExceptions = {ArithmeticException.class, NullPointerException.class})
	public void searchTest() {
		System.out.println("searchTest");
		int i = 9/0;//AE
		
		ExpectedExceptionConcept obj = new ExpectedExceptionConcept();
		obj = null;
		obj.name = "Naveen";//NPE
	}

}

//100 tcs -- NSE, STALEREFEXCEP,  
//PASSED