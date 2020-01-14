package TestNgPackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgGroupA {
	@Test(groups={"Regration"})
	public void m1()
	{
		System.out.println("This is m1 of A");
	}
	@Test
	public void m2()
	{
		System.out.println("This is m2 of A");
	}
	@Test(groups={"Regration"})
	public void m3()
	{
		System.out.println("This is m3 of A");
	}
	@Test
	public void m4()
	{
		System.out.println("This is m4 of A");
	}
	@Test
	public void m5()
	{
		System.out.println("This is m5 of A");
	}

}
