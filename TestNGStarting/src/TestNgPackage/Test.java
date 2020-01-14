package TestNgPackage;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Test {

	public static String baseurl="https://www.guru99.com/all-about-testng-and-selenium.html";
	public static WebDriver driver=new FirefoxDriver();
	
	public static void main(String[] args) {
		
		driver.get("baseurl");
		driver.quit();
		
		public static void VerifyHomePageTitle()
		{
			String expectedTitle="welcome tour";
			String actualTitle=driver.getTitle();
			try{
				Assert.assertEquals(actualTitle,expectedTitle);
				System.out.println("Test pass");
			}
			catch (Throwable e)
			{
				System.out.println("Test failed");
				
			}
		}
	
	}
}


		
