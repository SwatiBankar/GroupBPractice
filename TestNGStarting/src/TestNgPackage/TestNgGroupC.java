package TestNgPackage;

import org.testng.annotations.Test;

public class TestNgGroupC {
	@Test
	public void m1()
	{
		System.out.println("This is m1 of C");
	}
	@Test
	public void m2()
	{
		System.out.println("This is m2 of C");
	}
	@Test
	public void m3()
	{
		System.out.println("This is m3 of C");
	}
	@Test(groups={"Regration"})
	public void m4()
	{
		System.out.println("This is m4 of C");
	}
	@Test
	public void m5()
	{
		System.out.println("This is m5 of C");
	}


}
