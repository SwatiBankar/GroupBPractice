package PagesForPOI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class logInToWorldPress {
	WebDriver driver;
	//global variable
		By username=By.id("user_login");
		By password=By.xpath("//input[@id='user_pass']");
		By logInButton=By.xpath("//input[@id='wp-submit']");
	public logInToWorldPress(WebDriver driver1)
	{
		this.driver=driver1;
	}
	public void typeUserName()
	{
		driver.findElement(username).sendKeys("admin");
	}
	public void typePassword()
	{
		driver.findElement(password).sendKeys("demo123");
	}
	public void clickOnLogInButton()
	{
		driver.findElement(logInButton).click();
	}
		

	

}
