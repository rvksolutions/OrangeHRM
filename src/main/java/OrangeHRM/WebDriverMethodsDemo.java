package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMethodsDemo {

	public static void main(String[] args) {
	
		WebDriverManager.chromiumdriver().setup();		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.manage().window().fullscreen();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println("pagetile"+driver.getTitle());
		
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.navigate().to("https://www.facebook.com");
		
		
		driver.close();

	}

}
