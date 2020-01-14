package TestNgPackage;

import org.testng.annotations.Test;

public class SignUp {
	private static final String RegrationNew = null;
	@Test(invocationCount=3)
	public void positiveTestCase()
	{
		System.out.println("this test case run three times");
	}
	@Test(invocationTimeOut=1000)
	public void TC_1()
	{
		System.out.println("This test case run within 1000ms");
	}
	@Test(expectedExceptions={ArithmeticException.class})
	public void TC_2()
	{
		System.out.println("This annotation will use to handle exception");
		throw new ArithmeticException();
	}
	@Test(groups={"RegrationNew"})
	public void TC_3()
	{
		System.out.println("This Test case added to group RegrationNew");
		
	}
	@Test(groups={"RegrationNew"},invocationCount=3)
	public void TC_4()
	{
		System.out.println("this method use to check for arument of different type");
	}
	

}
