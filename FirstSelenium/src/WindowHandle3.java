
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\JAR\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//String parent_window=driver.getWindowHandle();
		//System.out.println("Before switching title is"+driver.getTitle());
		//driver.findElement(By.xpath("//*[@id='TosLink']")).click();
		
		/*Set<String> s1=driver.getWindowHandles();
		java.util.Iterator<String> i1=s1.iterator();
		while(i1.hasNext())
		{

		String child_window=i1.next();
		if(! parent_window.equalsIgnoreCase(child_window))
		{
		driver.switchTo().window(child_window);
		Thread.sleep(10000);
		System.out.println("Back to parent window:"+driver.getTitle());
*/		
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("swapnakharat18@gmail.com");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
		//driver.switchTo().window(parent_window);
		//System.out.println(driver.getTitle());

}
}