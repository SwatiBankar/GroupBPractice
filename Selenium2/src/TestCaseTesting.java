import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCaseTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.amazon.in");
				driver.findElement(By.xpath("//a[@id='nav-orders']")).click();
				//driver.findElement(By.xpath("//span[contains(text(),'Hello. Sign in')]"));
				driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("swatibankar88@gmail.com");
				driver.findElement(By.xpath("//input[@id='continue']")).click();
			
				driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
				String title=driver.getTitle();
				System.out.print(title);
				
				if(title.contains("Sign In"))
				{
					System.out.print("Test case 01 is passed");
				}
				else
				{
					System.out.print("Test case is failed");
				}

		}

}


