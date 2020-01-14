import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\JAR\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name='submit']")).submit();
		
		//switching to alert
		Alert alert=driver.switchTo().alert();
		
		//capturing alert message
		String alertMessage=driver.switchTo().alert().getText();
		
		//displaying alert message
		
		System.out.print(alertMessage);
		Thread.sleep(5000);

		//accepting alert
		alert.accept();
		
	}

}
