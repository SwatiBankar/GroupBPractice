package TestNgPackage;

import org.testng.annotations.Test;

public class testNgDependancy {
	
	@Test
	public void logIn()
	{
		System.out.println("log in to app");
		int i=9/0;
	}
	
	@Test(dependsOnMethods={"logIn"})
	public void composeMailTest()
	{
		System.out.println("compose mail test-p1");
	}

}
