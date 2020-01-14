import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchingIEBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "D:\\JAR\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();

	}

}
