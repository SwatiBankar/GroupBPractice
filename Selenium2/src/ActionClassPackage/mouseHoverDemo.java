package ActionClassPackage;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseHoverDemo {
	public static WebDriver driver;

	public static void main(String[] args) {
	 WebDriverManager.chromedriver().setup();	
     driver=new ChromeDriver();
     driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
     
     WebElement element=driver.findElement(By.xpath("//button[@class='btn btn-default dropdown-toggle']"));
     Actions action=new Actions(driver);
     action.moveToElement(element).perform();
     List<WebElement> links=driver.findElement(By.xpath("//*[@id='post-body-4615304122771162527']/div[1]/div/ul/li[1]/a"));
     
     
     
     
	}

}
