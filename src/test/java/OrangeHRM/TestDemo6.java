package OrangeHRM;

import java.io.File;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TestDemo6 {

	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest extentTest;

	public TestDemo6() {
		
	}
  @BeforeClass
  public void setUp() {
	// initialize the HtmlReporter
      htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"\\test-output\\testReport.html");
      
      //initialize ExtentReports and attach the HtmlReporter
      extent = new ExtentReports();
      extent.attachReporter(htmlReporter);
       
      //To add system or environment info by using the setSystemInfo method.
      extent.setSystemInfo("OS", "Windows10");
      extent.setSystemInfo("Browser", "Edge");
      
      //configuration items to change the look and feel
      //add content, manage tests etc
      htmlReporter.config().setChartVisibilityOnOpen(true);
      htmlReporter.config().setDocumentTitle("Orange HRM");
      htmlReporter.config().setReportName("Regression Report");
      htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
      htmlReporter.config().setTheme(Theme.STANDARD);
      htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
	 
  }
	
  @Test
  public void loginTest() {
	  
	  extentTest=extent.createTest("Login Test");
	  System.out.println("TestMethod");
	  Assert.assertTrue(false);
  }
  
  @AfterMethod
	public void getResult(ITestResult result) {
		   if(result.getStatus() == ITestResult.FAILURE) {
			   extentTest.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" FAILED ", ExtentColor.RED));
			   extentTest.fail(result.getThrowable());
	        }
	        else if(result.getStatus() == ITestResult.SUCCESS) {
	        	extentTest.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" PASSED ", ExtentColor.GREEN));
	        }
	        else {
	        	extentTest.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" SKIPPED ", ExtentColor.ORANGE));
	        	extentTest.skip(result.getThrowable());
	        }
		   
		   
	}
  
  @BeforeClass
  public void tearDown() {
	  //extentReports.flush();
  }
}
