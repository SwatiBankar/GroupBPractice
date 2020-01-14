/*project name:Test Automation Framework
 * Author:swati Bankar for Testing shastra
 * client:friends
 * organisation:Testing Shastra 
 *  @param browserName.Browser name should only include,chrome ,firefox,IE,HTMLUnit,Safari, 
 *  no browser name appart from mentioned is allowed
 */

package Keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keywords {
	 
	public static void openBrowser(String browserName)
	{
		switch(browserName)
		{
		case "chrome":
			System.out.println("opening chrome browser");
			WebDriverManager.chromedriver().setup();
			constant.driver=new ChromeDriver();
			break;
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			constant.driver=new FirefoxDriver();
			break;
			
		case "HTMLUnit"://it is a headless browser so it can not handle by web driver manager
			constant.driver=new HtmlUnitDriver();
			break;
		default:
			System.err.print("Invalid browser name:"+browserName);
			
		}
		
	}
	/*it open the specified url in web browser recently opened by drivrr instance
	 * @param url{@code String} url to open
	 *
	 */
 public static void openURL(String url)
	{
	    System.out.println(url+"is loading...");
		constant.driver.get(url);
	}
 private static WebElement getWebelement(String locatorType,String locatorValue)
 {
	 WebElement element=null;
	 switch(locatorType)
	 {
	 case "XPATH":
		element= constant.driver.findElement(By.xpath(locatorValue));
		 break;
		 
	 case "CSS":
		 element= constant.driver.findElement(By.cssSelector(locatorValue));
		 break;
		 
	 case "ID":
		 element= constant.driver.findElement(By.id(locatorValue));
		 break;
	 case "LINKTEXT":
		 element= constant.driver.findElement(By.linkText(locatorValue));
		break;
	 case "PARTIAL_LINK_TEXT":
		 element= constant.driver.findElement(By.partialLinkText(locatorValue));
		 break;
	 case "CLASS_NAME":
		 element= constant.driver.findElement(By.className(locatorValue));
		 break;
		 
		 default:
			 System.err.println("Invalid Locator Type :"+locatorType+"Expected :CSS,XPATH,ID,LINKTEXT,PARTIAL_LINK_TEXT,CLASS_NAME");
		 break;
		 
	 }
	return element;		
	 
 }
  
 public static void enterText(String locatorType, String locatorValue, String texttoEnter) 
	    {
	      getWebelement(locatorType, locatorValue).sendKeys(texttoEnter);
	    }
 
 public static void clickOnElement(String locatorType,String locatorValue)
       {
	 getWebelement( locatorType, locatorValue).click();
	 
       }
 public static void selectValueFromDropdown(String locatorType,String locatorValue,String texttoselect)
      {
	 WebElement element=getWebelement(locatorType, locatorValue);
	 Select select=new Select(element);
	 select.selectByVisibleText(texttoselect);
      }
 public static void maximizeBrowser()
      {
	     constant.driver.manage().window().maximize();
      }
 public static void closeBrowser()
      {
	    constant.driver.close();
      }
 public static void closeAllBrowsers()
      {
	   constant.driver.quit();
      }
	 
}
 


