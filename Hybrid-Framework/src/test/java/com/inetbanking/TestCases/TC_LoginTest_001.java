package com.inetbanking.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageobject.LoginPage;

//User ID :	mngr237997
//Password :Ujehuhu

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest()
	{
		
		logger.info("URL is opened");
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserName(username);
		logger.info("Entered user name");
		
		lp.setpassword(password);
		logger.info("Entered password");
		
		lp.clickSubmit();
		System.out.println(driver.getTitle());
		
		if(driver.getTitle().equals("GTPL Bank Manager HomePage"))
		  {
			Assert.assertTrue(true); 
			logger.info("Log in test passed");
		  }
		else
		  {
			Assert.assertTrue(false);
			logger.info(" Log in test failed");
		  }
		
		
	}

}
