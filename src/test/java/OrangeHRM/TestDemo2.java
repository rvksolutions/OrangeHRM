package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDemo2 {
	
	WebDriver driver;

  @BeforeClass
  public void doSetup() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.id("btnLogin")).click();
	  driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	  
	  
  }
  
  
  @Test(priority = 2,description = "doing search by user name")
  public void searchUser() {
	  
	  driver.findElement(By.id("searchSystemUser_userName")).sendKeys("adash");
	  driver.findElement(By.id("searchBtn")).click();
	  boolean flag=driver.findElement(By.linkText("adash")).isDisplayed();
	  System.out.println(flag);
	
  }
  
  @Test(priority = 1)
  public void deleteUser() {
	  
	  
	  driver.findElement(By.xpath("//input[@value=46]")).click();
	  driver.findElement(By.className("delete")).click();
	  System.out.println(driver.getWindowHandles().size());
	  driver.findElement(By.xpath("(//input[@value='Cancel'])[2]")).click();
	
  }
  
  @Test
  public void updateUser() {
	  
	
  }
  
  @AfterClass
  public void tearDown() {
	  
	 driver.close();
	  
  }
  
  
  
  @Test(enabled=false)
  public void loginToOrangeHRM() {
	  
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.id("btnLogin")).click();
	  boolean flag=driver.findElement(By.id("menu_dashboard_index")).isDisplayed();
	  
	  System.out.println(flag);
  }
}
