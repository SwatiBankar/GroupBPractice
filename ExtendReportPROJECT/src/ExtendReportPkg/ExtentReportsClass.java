package ExtendReportPkg;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class ExtentReportsClass {
	ExtentReports extent;
	ExtentTest logger;
	@BeforeTest
	public void startTest()
	{
		extent=new ExtentReports(System.getProperty("user.dir")+"/test-output/ExtentReport.html",true);
		
		
	}

}
