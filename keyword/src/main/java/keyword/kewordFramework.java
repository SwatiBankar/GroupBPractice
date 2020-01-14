package keyword;

import io.github.bonigarcia.wdm.WebDriverManager;

class kewordFramework {
	
		public static  Webdriver driver;

		public String openBrowser(String browserName) {

		switch (browserName) {

		case "Chrome":
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		break;
		case "IE":
		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver();
		break;
		case "Firefox":
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		break;
		case "HTMLUnit":
		driver = new HtmlUnitDriver();

		default:
		System.out.println("Invalid browser name:" + browserName);
		break;

		}

		}

		public void openUrl(String url) {
		driver.get(url);
		}

		public void enterText(String textToEnter, WebElement element) {

		}

		public void enterText(String textToEnter,String locatorType,String locatorValue) {


		}

		public WebElement getElement(String locatorType,String locatorValue)
		 
		   WebElement element;
		{
		switch(locatorType) {

		case "XPATH":
		element=driver.findElement(By.xpath(locatorValue));
		break;
		case "CSS":
		element=driver.findElement(By.cssSelector(locatorValue));
		break;
		case "LINK_TEXT":
		element=driver.findElement(By.linkText(locatorValue));
		break;
		case "TAGNAME":
		element=driver.findElement(By.tagName(locatorValue));
		break;
		case "PARTIAL_LINK_TEXT":
		element=driver.findElement(By.partialLinkText(locatorValue));
		break;
		case "CLASS_NAME":
		driver.findElement(By.className(locatorValue));
		break;
		case "NAME":
		driver.findElement(By.name(locatorValue));
		break;

		}

		return element;
		}
		}

		
	}

	
	
}


