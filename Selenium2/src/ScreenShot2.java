import java.io.File;
import java.io.IOException;

import javax.imageio.IIOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot2 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\JAR\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com");
		
		//take screenshot and saved as file format
      File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);		
		try{
			
		 FileUtils.copyFile(src,new File("Scrrenshot/googel.png"));	
		 }catch(IOException e)
		{
			 System.out.println(e.getMessage());
		}

	}

}
