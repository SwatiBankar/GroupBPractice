import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.*;
import javax.imageio.ImageIO;




import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenShotByUsingRobotClass {
	
	public static String CaptureScreenShot(String TestStepName)
	{
		try{
			//creating robot class object
			Robot robotclassobject=New Robot();
			
			//get screen size
			Rectangle screensize=new Rectangle(Toolkit.getDefaultToolkit().GetScreenSize());
			
			//capturing screen size by providing size
			BufferedImage temp=robotclassobject.createScreenCapture(screensize);
			
			//Defining destination file path
			String path1=System.setProperty("user.dir")+"/ScreencapturesPNG/"+teststepname+System.currentTimeMilis()+".png" ;
			
			//to copy temp image into permenent file
			ImageIO.write(tmp,"png",new File(path));
			rerurn path;
		}catch(Exception e)
		{
			System.out.println("some exceptions occured"+e.getMessage());
			return"";
		}
	

	public static void main(String[] args)throw InturuptedException
	{
		System.setproperty("webdriver.Chrome.driver","./exefiles/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://makeseleniumeasy.com");
		captureScreenshotUsingRobot.CaptureScreenShotWithTestStepNameUsingRobotClass("URL-Loading");
			
	}

}
