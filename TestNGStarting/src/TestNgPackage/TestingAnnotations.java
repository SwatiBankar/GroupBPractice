package TestNgPackage;



import javax.imageio.IIOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;





public class TestingAnnotations {
	
	
	@Parameters({"studentName","studentNo"})
	@Test
	public void m1(@Optional("ABC") String studentName,String studentNo)throws IIOException
	{
		System.out.println("This is m1 method<<<studentname" + studentName);
		System.out.println("This is m1 method<<<rollnumber" + studentNo);
		

	}
	@BeforeTest
	public void m2()
	{
		System.out.println("This is m2 method");
	}
	@Test
	public void m3()
	{
		System.out.println("This is m3 method");
	}
	@AfterTest
	public void m4()
	{
		System.out.println("This is m4 method");
	}
	@BeforeSuite
	public void m5()
	{
		System.out.println("This is m5 method");
	}
	@AfterSuite
	public void m6()
	{
		System.out.println("This is m6 method");
	}
	@BeforeMethod
	public void m7()
	{
		System.out.println("This is m7 method");
	}
	@AfterMethod
	public void m8()
	{
	  System.out.println("This is m8 method");	
	}
	@BeforeClass
	public void m9()
	{
		System.out.println("This is m9 method");
	}
	@AfterClass
	public void m10()
	{
		System.out.println("This is m10 method");
	}

}
