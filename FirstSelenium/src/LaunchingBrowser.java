import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\JAR\\New folder\\chromedriver.exe");
		//ChromeDriver  driver=new ChromeDriver();
        WebDriver driver=new ChromeDriver();
	}

}
//"D:\JAR\chromedriver_win32\chromedriver.exe"