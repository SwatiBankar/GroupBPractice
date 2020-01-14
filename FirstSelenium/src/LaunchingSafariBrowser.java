import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LaunchingSafariBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.safari.driver", "D:\\JAR\\selenium-safari-driver-2.32.0.jar.exe");
		WebDriver driver=new SafariDriver();

	}

}
