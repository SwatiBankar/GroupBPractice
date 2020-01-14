package PagesForPOI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class google_Search {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@id='fakebox-input']")).sendKeys("automation step by step");
		driver.findElement(By.xpath("//div[@id='fakebox-search-icon']")).click();
		
	}

}
