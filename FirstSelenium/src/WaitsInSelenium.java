import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class WaitsInSelenium {
  public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\JAR\\New folder\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS); //(lonh time,timeunit)
		
		FluentWait wait=new FluentWait(driver);
		wait.pollingEvery(100,TimeUnit.MILLISECONDS);
		wait.ignoring(TimeoutException.class);
		wait.withTimeout(4,TimeUnit.SECONDS);
		wait.until(ExpectedConditions.attributeContains(By.xpath("//input[@name='firstname']"), "name", "firstname"));
		
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Swati");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Pachrne");

	}

}
