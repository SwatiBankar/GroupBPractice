package Startingselenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {
	public static void launchCrome()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\JAR\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
	}

	public static void main(String[] args)
	{
		launchCrome();
	}
	

}
