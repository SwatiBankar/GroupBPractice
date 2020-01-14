package com.inetbanking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver Ldriver;
	
	public LoginPage(WebDriver Rdriver)
	{
		Ldriver=Rdriver;
		PageFactory.initElements(Rdriver,this);
	}
	@FindBy(name="uid")
	@CacheLookup
	WebElement txtUserName;

	@FindBy(name="password")
	@CacheLookup 
	WebElement txtpassword;
	
	@FindBy(name="btnLogin")
	@CacheLookup 
	WebElement btnLogin;
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setpassword(String pwd)
	{
		txtpassword.sendKeys(pwd);
	}
	public void clickSubmit()
	{
		btnLogin.click();
	} 
	
	
	
	
	
	

}
