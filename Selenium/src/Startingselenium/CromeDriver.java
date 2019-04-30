package Startingselenium;
import org.openqa.selenium.chrome.ChromeDriver;

public class CromeDriver {
	public static void main(String[] args)
	{
		System.setProperty("webDriver.crome.Driver", "C:\\JAR\\chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();
	}

}
