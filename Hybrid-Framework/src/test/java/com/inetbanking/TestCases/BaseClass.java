package com.inetbanking.TestCases;



import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.inetbanking.utilities.ReadConfig;

public class BaseClass {
	
	    ReadConfig readconfig=new ReadConfig();
	    
	    public String baseURL=readconfig.getApplicationURL();
		public String username=readconfig.getUsername();
		public String password=readconfig.getPassword();
		public static WebDriver driver;
		 
		public static Logger logger;
		@Parameters({"browser"})
		@BeforeClass
  public void setUp(String browser)
	{
			
			
		    logger=Logger.getLogger("BaseClass");
			PropertyConfigurator.configure("Log4j.properties");
			
		if(browser.equals("chrome"))
		  {
			System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
			driver=new ChromeDriver();
		  }
		else if(browser.equals("firefox"))
		 {
			System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxPath());
			driver=new FirefoxDriver();
		 }
		else if(browser.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver",readconfig.getIEpath());
			driver=new InternetExplorerDriver();	
		}
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		
}	
		@AfterClass
		public void TearDown()
		{
			
			driver.quit();
		}
		
}
