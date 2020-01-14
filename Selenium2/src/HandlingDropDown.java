import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropDown {
     public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB");
		Thread.sleep(5000);
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		Select select=new Select(day);
		 select.selectByIndex(13);
		 
		 WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		 Select select1=new Select(month);
		 select1.selectByValue("11");
		 
		 WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		 Select select2=new Select(year);
		 select2.selectByVisibleText("1994");
		 
		 


	}

}
