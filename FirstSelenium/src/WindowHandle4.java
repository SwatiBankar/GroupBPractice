import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\JAR\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Windows.html");
		System.out.print("Tital of the window :"+driver.getTitle());
	    WebElement tabbedWindowButton=driver.findElement(By.xpath("//button[@class='btn btn-info']/parent::a"));
	    tabbedWindowButton.click();
	    
	    Thread.sleep(5000);
	    Set<String> windowIDs=driver.getWindowHandles();
	    java.util.Iterator<String> itr=windowIDs.iterator();
	    String mainWindow=itr.next();
	    String childwindow=itr.next();
	    driver.switchTo().window(childwindow);
	    
	    System.out.print("The titel of the child window"+driver.getTitle());
	    
	    
	    
		
        // driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Swati");
        // driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Pachrne");
		
	}

}
