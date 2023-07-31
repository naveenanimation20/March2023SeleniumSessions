package testngsessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CRUDTest {

	// CRUD - ADD/GET/Update/Delete
	
	int userId = 1234567; //QA/STG/UAT/PROD

	public int addUser() {
		System.out.println("adding a user");
		int userId = 123;
		return userId;
	}

	@Test(priority = 1)
	public void addUserTest() {
		int userId = addUser();
		Assert.assertEquals(userId, 123);
	}

	@Test(priority = 2)
	public void getUserTest() {
		int userId = addUser();// 124
		System.out.println("get the user for user id: " + userId);
	}

	@Test(priority = 3)
	public void updateUserTest() {
		int userId = addUser();// 125
		System.out.println("update the user for user id: " + userId);
	}

	@Test(priority = 4)
	public void deleteUserTest() {
		int userId = addUser();// 126
		System.out.println("delete the user for user id: " + userId);
	}

}
