//testNG
import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkingSeleniumAxces {
	
	public static void main(String[] args)
	{

	
	System.setProperty("webdriver.chrome.driver","D:\\JAR\\New folder\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.makemytrip.com/flights/");
	driver.findElement(By.xpath("//input[@placeholders='From']")).sendKeys("pune");
	driver.findElement(By.xpath("//span[contains(text(),'pune')]")).click();
	driver.findElement(By.xpath("//input[@placeholders='Destination']")).sendKeys("Delhi(DEL");
	driver.findElement(By.xpath("//span[contains(text(),'Delhi')]")).click();
	driver.findElement(By.xpath("//input[@placeholders='Departure']")).click();
	
	
			
	//List<webElement> l=itr.next();
	//Iterator itr=l.iterator();
	
	
	
	
	
}
}