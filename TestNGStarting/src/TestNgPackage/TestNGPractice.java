package TestNgPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGPractice {
	@Test
	public void m1()
	{
		System.out.println("This is m1 method");
	}
	@BeforeTest
	public void m2()
	{
		System.out.println("This is m2 method");
	}
	@BeforeSuite
	public void m3()
	{
		System.out.println("This is m3 method");
	}
	@AfterSuite
	public void m4()
	{
		System.out.println("This is m4 method");
	}
	@BeforeMethod
	public void m5()
	{
		System.out.println("This is m5");
	}
	@AfterMethod
	public void m6()
	{
		System.out.println("This is m6");
	}
	@Test(enabled=false)
	public void m7()
	{
		System.out.println("This is m7 method");
	}

}
