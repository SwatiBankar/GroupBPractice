package TestNgPackage;

import org.testng.annotations.Test;

public class TestNgGroupB {
	@Test
	public void m1()
	{
		System.out.println("This is m1 of B");
	}
	@Test
	public void m2()
	{
		System.out.println("This is m2 of B");
	}
	@Test(groups={"Regration"})
	public void m3()
	{
		System.out.println("This is m3 of B");
	}
	@Test
	public void m4()
	{
		System.out.println("This is m4 of B");
	}
	@Test
	public void m5()
	{
		System.out.println("This is m5 of B");
	}


}
