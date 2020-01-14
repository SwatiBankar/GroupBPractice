
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;






public class CaptureScreenShots {

	public static void main(String[] args)  
	{
		System.setProperty("webdriver.chrome.driver", "D:\\JAR\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("www.google.com");
		//TakesScreenshot ts=(TakesScreenshot)driver;
		
		//File source=ts.getScreenshotAs(OutputType.FILE);
		
		//FileUtils.copyFile(source,new File("ScreenShots//google.jpg")+ System.currentTimeMillis();
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try{
			FileUtils.copyFile(src,new File("ScreenShots//google.jpg"));
		}
	catch(IOException e)
		{
		System.out.println();
		}
	}

}
