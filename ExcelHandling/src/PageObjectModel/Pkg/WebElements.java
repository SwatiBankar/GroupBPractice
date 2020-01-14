package PageObjectModel.Pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WebElements {
	WebDriver driver;
	
	@FindBy(how=How.XPATH,name="user_login") WebElement user_login;
	@FindBy(how=How.XPATH,using="//input[@id='user_pass']")WebElement password;
	@FindBy(how=How.XPATH,using="//input[@id='wp-submit']")WebElement submit;
	public WebElements(WebDriver driver1 )
	{
		this.driver=driver1;
	}
	public void logInMethod(String uid,String upwd)
	{
		user_login.sendKeys(uid);
		password.sendKeys(upwd);
		submit.click();
	}

}
