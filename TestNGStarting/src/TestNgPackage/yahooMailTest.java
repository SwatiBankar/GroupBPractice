package TestNgPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class yahooMailTest {
	@BeforeClass
	public void launchBrouser()
	{
		System.out.println("chrome brouser");
	}
	@BeforeMethod
	public void logIn()
	{
		System.out.println("log in to app");
	}
	
	@Test
	public void composeMailTest()
	{
		System.out.println("compose mail test-p1");
	}
	
	@Test(priority=2,enabled=true)
	public void deleteMailTest()
	{
		System.out.println("delete mail test p2");
	}
	
	@Test(priority=3,expectedExceptions={ArithmeticException.class})
	public void searchMailTest()
	{
		System.out.println("searchMailTest p3");
		int i=9/0;
		throw new ArithmeticException();
		
		
	}
	
	@Test
	public void sentItemsMailTest()
	{
		System.out.println("sentItemsMailTest");
		
	}
	

	@AfterMethod
	public void logOut()
	{
		System.out.println("logOut to app");
	}
	
	@AfterClass
	public void quiteBrowser()
	{
		System.out.println("quite Browser");
	}
}
