package DDT;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class wordPressLogIn {
	public static WebDriver driver;
	//public static void main (String[]args)
	//{
		//logIntoWordPress();
	//}
	@Test(dataProvider="wordpressData")
	public static void logIntoWordPress(String userName,String passWord) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://demosite.center/wordpress/wp-login.php");
        driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("userName");
        driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("passWord");
        driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
        Thread.sleep(5000);
       // System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().contains("Log In"),"User is not able to log in-Invalid Credentail");
        System.out.println("User log in is verified -user is able to log in succesfully");
        
	}
	@AfterMethod
	public void tearDown()
	{
		System.out.println("This is tearDown method which is come after tc1");
		driver.quit();
	}
	@DataProvider(name="wordpressData")
	public Object[][] passData()
	{
		Object[][] data=new Object[3][2];
		data[0][0]="admin1";
		data[0][1]="demo1";
		
		data[1][0]="admin2";
		data[1][1]="demo2";
		
		data[2][0]="admin3";
		data[2][1]="data3";
		return data;
	}

}
