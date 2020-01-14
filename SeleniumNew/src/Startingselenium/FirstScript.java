package Startingselenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {
	public static void main(String[] args)
	{
		System.setProperty("webDriver.crome.Driver", "CromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
	}

}
