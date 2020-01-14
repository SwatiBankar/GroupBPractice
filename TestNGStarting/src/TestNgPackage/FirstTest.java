package TestNgPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {

	@Test(priority=1,description="This Test case verify login functionality")
	public void logInApplicatin() {
		System.out.println("login to application");
		Assert.assertEquals(12, 13);

	}
	@Test(priority=2,description="This test case will add certain items in basket")
	public void SelectItem()
	{
		System.out.println("Item Selected");
	}
	@Test(priority=3,description="This test case will perform checkout operation")
	public void checkout()
	{
		System.out.println("checkout completed");
	}

}
