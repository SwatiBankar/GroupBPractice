package PageObjectModel.Pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LogInClassPageFactory {
	@Test()
	public void verifyValidLogIn() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		 WebElements locateElement =PageFactory.initElements(driver, WebElements.class);
		 locateElement.logInMethod( "uid", "upwd");
		 Thread.sleep(5000);
		 driver.quit();
	}

	
	
	

}
