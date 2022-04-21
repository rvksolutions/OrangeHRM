package OrangeHRM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestDemo1 {
	
	@Test(dataProvider = "dp")
	public void f(Integer n, String s) {
		
		System.out.println("Test Annotation");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method Annotation");
	}

	@AfterMethod
	public void afterMethod() {
		
		System.out.println("After Method Annotation");
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { 1, "a" }, new Object[] { 2, "b" }, new Object[] { 3, "c" } };
	}

	@BeforeClass
	public void beforeClass() {
		
		System.out.println("Before Class Annotation");
	}

	@AfterClass
	public void afterClass() {
		
		System.out.println("After Class Annotation");
	}

	@BeforeTest
	public void beforeTest() {
		
		System.out.println("Before Test Annotation");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test Annotation");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite Annotation");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite Annotation");
	}

}
