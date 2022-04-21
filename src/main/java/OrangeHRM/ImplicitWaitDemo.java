package OrangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitDemo {

	public static void main(String[] args) {

		WebDriverManager.chromiumdriver().setup();		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		
		
		
		driver.findElement(By.linkText("JavaScript Alerts")).click();
	}

}
