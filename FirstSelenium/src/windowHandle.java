import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowHandle {
	//action class
	
	
	public static void testcase()throws AWTException,IOException,IOException
	{
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.Chrome.driver", "D:\\JAR\\New folder\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/?affid=partnersi&affExtParam1=July-Aff-1-309206&affExtParam2=8gsqimin1ccvih03inr");
		driver.findElement(By.xpath("//Button[text()='x']")).click();
		Actions action =new Actions(driver);
		WebElement mens=driver.findElement(By.xpath("//span[contains((text(),'Men')]"));
		action.moveToElement(mens);
		action.contextClick();
		action.perform();
		
		
	}
	public static void main(String[] args)throws Exception,InterruptedException
	{
		testcase();
		
	}
}



		
		
	
	


