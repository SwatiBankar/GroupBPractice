package ExtendReportPkg;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extendReportDemo {
	
		@Test
		public void logInTest()
		{
			
			System.out.println("Log in to amazon");
			ExtentHtmlReporter reporter=new ExtentHtmlReporter("./ExtendReportFolder/");
			ExtentReports extent=new ExtentReports();
			extent.attachReporter(reporter);
			
			ExtentTest logger=extent.createTest("MyFirstTest","Sample Description");
			logger.log(Status.INFO,"This step show usage of log(status,details)");
			logger.info("This step shows usage of info(details)");
			
			logger.log(Status.PASS,"Log in to amazon");
			
			System.out.println("Title verified");
			reporter.flush();
		}

	

}
