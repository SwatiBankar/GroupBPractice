import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandlingAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\JAR\\New folder\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://ksrtc.in/oprs-web/pkg/tours/loadPlaces.do");
		  driver.findElement(By.xpath("//input[@type='button']")).click();
		  Thread.sleep(2000);
		//Alert alt= driver.switchTo().alert();
		 //alt.accept();
		  String actual_msg =driver.switchTo().alert().getText();
		  System.out.print("message is<<"+actual_msg);
		  driver.switchTo().alert().accept();
		  String expected_msg="Form place is requoired pklease update the same";
          Assert.assertEquals(actual_msg,expected_msg );
          driver.quit();

	}

}
