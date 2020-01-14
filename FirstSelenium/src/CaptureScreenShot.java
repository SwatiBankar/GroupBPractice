

	
	
	import java.awt.AWTException;
	import java.awt.HeadlessException;
	import java.awt.Rectangle;
	import java.awt.Robot;
	import java.awt.image.BufferedImage;
	import java.io.File;

	import javax.imageio.ImageIO;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import java.awt.Toolkit;
	import java.awt.event.KeyEvent;


	public class CaptureScreenShot {

	public static void main(String[] args) throws Exception, AWTException {

	File file=new File("./ScreenShot/example.png");

	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/");

	Robot robot=new Robot();
	Rectangle screen=new Rectangle(0,0,1920,1080);
	BufferedImage image=robot.createScreenCapture(screen);

	ImageIO.write(image, "png", file);
	System.out.println("Closing chrome");
	robot.keyPress(KeyEvent.VK_ALT);
	robot.keyPress(KeyEvent.VK_F4);

	Thread.sleep(4000);

	robot.keyRelease(KeyEvent.VK_ALT);
	robot.keyRelease(KeyEvent.VK_F4);

	System.out.println("Chrome is Closed");

 driver.manage().window().getSize();



	/*
	* BufferedImage image=new Robot().createScreenCapture(new
	* Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
	* ImageIO.write(image,"png",new
	* File("\"D:\\Selenium\\ScreenShot\\CurrentScreenShot.png"));
	*/


	}}


	




