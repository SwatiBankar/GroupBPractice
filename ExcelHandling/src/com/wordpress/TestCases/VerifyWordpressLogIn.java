package com.wordpress.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PagesForPOI.logInToWorldPress;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyWordpressLogIn {
	
	
	@Test()
	public void verifyValidLogIn()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		 logInToWorldPress login=new  logInToWorldPress(driver);
		 login.typeUserName();
		 login.typePassword();
		 login.clickOnLogInButton();
		// driver.quit();
	}

}
