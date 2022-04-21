package OrangeHRM;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSExecutorDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();

		
	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		
		WebElement e1=driver.findElement(By.id("txtUsername"));
		js.executeScript("arguments[0].setAttribute('style', 'background: green; border: 2px solid red;');",e1);
		
		WebElement e2=driver.findElement(By.id("txtPassword"));
		js.executeScript("arguments[0].setAttribute('style', 'background: red; border: 2px solid green;');",e2);
		
		
	}
}
