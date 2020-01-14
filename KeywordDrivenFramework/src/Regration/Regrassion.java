package Regration;

import org.testng.annotations.Test;

import FileUtility.PropertiesFile;
import Keyword.Keywords;

public class Regrassion {
	@Test
	public void TC_01() throws InterruptedException
	{
		Keywords.openBrowser("chrome");
		Keywords.openURL("https://www.facebook.com/");
		String[] parts=PropertiesFile.getLocator("email");
		Keywords.enterText(parts[0],PropertiesFile.getLocator("email")[1],"testemail@gmail.com");
		Keywords.enterText(PropertiesFile.getLocator("passwd")[0],PropertiesFile.getLocator("passwd")[1],"test@123");
		//Keywords.clickOnElement("XPATH","//input[@value='Log In']");
		
		//Keywords.selectValueFromDropdown("XPATH", "//select[@name='birthday_day']", "2");
		// Keywords.selectValueFromDropdown("XPATH", "//select[@name='birthday_month']", "Mar");
		//Keywords.selectValueFromDropdown("XPATH", "//select[@name='birthday_year']", "1987");
		
		//after locators write in property file then we can directly use like following way
		
		Keywords.selectValueFromDropdown(PropertiesFile.getLocator("day")[0],PropertiesFile.getLocator("day")[1], "2");
		Keywords.selectValueFromDropdown(PropertiesFile.getLocator("month")[0],PropertiesFile.getLocator("month")[1],"Mar");
		Keywords.selectValueFromDropdown(PropertiesFile.getLocator("year")[0],PropertiesFile.getLocator("year")[1],"1987");
		
		Keywords.maximizeBrowser();
		//Keywords.closeBrowser();
		//Keywords.closeAllBrowsers();
	}

}
