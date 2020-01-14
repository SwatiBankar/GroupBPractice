package com.inetbanking.utilities;
//Listener classused togenerate extent Reports
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

 public class Reporting extends TestListenerAdapter {
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest logger;
	
 public void onstart(ITestContext testcontext )
  {
	String timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());//time stamp
	String repName="Test-Report-"+timestamp+".html";
	htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/"+repName);//specify location
	htmlReporter.loadXMLConfig(System.getProperty("user.dir")+"/extent-config.xml");
	
	extent =new ExtentReports();
	
	extent.attachReporter(htmlReporter);
	extent.setSystemInfo("Host name", "localhost");
	extent.setSystemInfo("Environment","QA");
	extent.setSystemInfo("user", "swati");
	
	htmlReporter.config().setDocumentTitle("InetBanking Test Project");//Title of Report
	htmlReporter.config().setReportName("Functional Test Report");//name of the Report
	htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);//location of the chart
	htmlReporter.config().setTheme(Theme.DARK);
  }
 public void onTestSuccess(ITestResult tr)
   {
       logger=extent.createTest(tr.getName());//creat new entry in the report
       logger.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));//send the pass information
       
   }
 public void onTestFeilure(ITestResult tr)
   {
	 
	 logger=extent.createTest(tr.getName());//creat new entry in the Report
	 logger.log(Status.FAIL,MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));//sent the pass information 
	 
	 String screenshotPath =System.getProperty("user.dir")+"\\Screenshots\\"+tr.getName()+".png";
	 File f=new File(screenshotPath);
	 if(f.exists())
	 {
		 try{
			 logger.fail("Screenshot is bellow:"+logger.addScreenCaptureFromPath(screenshotPath));
			 
		    }
		 catch(IOException e)
		   {
			 e.printStackTrace();
		   }
	 }
	 
   }
 public void onTestSkipped(ITestResult tr)
      {
	    logger=extent.createTest(tr.getName());//creat new entry in the report
	    logger.log(Status.SKIP,MarkupHelper.createLabel(tr.getName(),ExtentColor.ORANGE));
      }
 public void onFinish(ITestContext testContest)
     {
	  extent.flush(); 
     }
	 
	 
 }
