package SeleniumPackage;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

public class RobotClassDemo {

public static  void test01() throws AWTException
{
	WebDriverManager.cromedriver().setup();
	webDriver driver=new ChromeDriver();
	driver.get("https://www.shutterfly.com/");
	driver.findElement(By.xpath(""));
	Robot robo=new Robot();
	WebElement photo=driver.findElement(By.xpath("(/span[text]='Photo Books]')[1]"));
	
	robo.mouseMove(10, 78);
	
	robo.mousePress(MouseEvent.BUTTON_LEFT);
	robo.mouseRelease(MouseEvent.BUTTON_LEFT);
	Rectangle rect=new Rectangle(920,1880);
	BufferedImage img=robo.createScreenCapture(rect);
	Image.putStream imageout=ImageOut.CreateImageOutputsStream();
	
	
	robo.mouseMove(50, 100);
	Thread.sleep(6000);
	

}

public static void main(String[] args) {

	
		
	}



}

	
	


