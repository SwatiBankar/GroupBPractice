import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class TakeFullPageScreenShot {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://my.naukri.com/account/register/basicdetails");
		AShot ashot=new AShot();
		Screenshot sc=ashot.shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		
		try {
			ImageIO.write(sc.getImage(), "jpg", new File("Screenshot/fullpage.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
       // sc.printstacktrace();
      
	}

}
