package SeleniumPackage;

public class Wait {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chromedriver","chromedriver");
		webDriver driver=new CromeDriver();
		driver.get("");
		webDriverwait wait=new webDriverwait(driver,10);
		//by using these method we can set explicit wait
		wait.pollingEvery(50,TimeUnit."MILISECONDS");
		wait.withTimeout(10,Timeunit."second");
		wait.ignoring(nosuchfielderror.class.nosuchelementException.class);
		wait.until(ExpectedCondition.visibilityof Elementlocated(By.xpath)())))
        driver.find
	}

}
