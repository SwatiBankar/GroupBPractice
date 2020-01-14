package TestNgPackage;

import org.testng.annotations.Test;

public class TestNggroups {
	@Test(groups={"Regration"})
	public void logIn()
	{
		System.out.println("log in to app");
		
	}
	
	@Test(groups={"Regration"})
	public void m1()
	{
		System.out.println("compose mail test-p1");
	}
	@Test(groups={"Index"})
	public void m2()
	{
		System.out.println("log in to app");
		
	}
	
	@Test(groups={"Index"})
	public void m3()
	{
		System.out.println("compose mail test-p1");
	}


}
