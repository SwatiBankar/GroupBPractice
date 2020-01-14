package AssertChecking;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertion {
	@Test
	public void softAssert()
	{
		SoftAssert softassertion=new SoftAssert();
		System.out.println("softAssert method was started");
		softassertion.assertTrue(true);
		System.out.print("softassert method was executed ");
		softassertion.assertAll();
		
	}
	@Test
	public void hardAssert()
	{
		System.out.println("hard assert method was started");
		Assert.assertTrue(false);
		System.out.println("Hard assert method was executed");
	}

}
