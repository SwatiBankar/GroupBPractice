package TestNgPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestingTestNG {
	public WebDriver driver=null;
	@BeforeMethod
	public void setUp()
	{
		System.out.println("launch browser-chrome");
		driver=new ChromeDriver();
	}
	public void searchText()
	{
		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
