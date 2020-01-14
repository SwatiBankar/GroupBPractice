import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\JAR\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("swati");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Bankar Pachrne");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("swatibankar88@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("S22445338SB");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		
	}

}
