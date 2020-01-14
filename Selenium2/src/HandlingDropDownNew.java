import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropDownNew {
    public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB");
		driver.manage().window().maximize();
		//driver.switchTo().frame("//*[@id='captcha-recaptcha']");
		WebElement day_dropdown=driver.findElement(By.id("day"));
		Select dd=new Select(day_dropdown);
		
		WebElement selected_value=dd.getFirstSelectedOption();
		System.out.println("After selection of day  selected value is :"+selected_value.getText());
		dd.selectByIndex(13);
		
		
		
		
	}

}
