import org.openqa.selenium.By;

public class NewMavenDemo {
public static void main(String args[])
	
{
	public void enterText(String textToEnter,String locatorType,String locatorValue)
	{
		switch(locatorType)
		{
		case "xpath":
			driver.findElement(By.xpath(locatorValue).sendkeys());
		}
	}
}
}

