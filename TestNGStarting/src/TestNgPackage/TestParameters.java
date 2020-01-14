package TestNgPackage;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestParameters {
	@Parameters({"browser"})
	@Test
	public void testCaseOne(@Optional("Chrome")String browser)
	{
		System.out.println("This is the Browser we are using"+browser);
	}
	@Parameters({"username","password"})
	@Test
	public void textCaseTwo(@Optional("swati")String username,@Optional("swati@21")String password)
	{
		System.out.println("This is the User Name"+username);
		System.out.println("This is the User Name"+password);
		
		
		
	}

}
