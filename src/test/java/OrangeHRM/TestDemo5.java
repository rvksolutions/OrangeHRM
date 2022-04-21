package OrangeHRM;


import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestDemo5 implements ITestListener {

	
	public void onTestFailure(ITestResult result) {
	    System.out.println(result.getName()+"my result value is "+result.getStatus());
	  }
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("my result value is "+result.getStatus());
		  }
}
