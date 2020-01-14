import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.bcel.generic.ObjectType;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class ScreenShotDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\JAR\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.facebook.com");
		
	/*	AShot as= new AShot();
		Screenshot sc=as.takeScreenshot(driver);
		try {
			ImageIO.write(sc.getImage(),"jpg",new File("Scrrenshot/google.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	*/	
		
	TakesScreenshot ts=(TakesScreenshot)driver;	
 // Take screenshot and store as a file format
	File src=ts.getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(src,new File("Scrrenshot/google1.jpg"));
		System.out.println("screenshot taken");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

	}

