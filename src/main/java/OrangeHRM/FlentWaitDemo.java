package OrangeHRM;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlentWaitDemo {

	public static void main(String[] args) {

		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();

	
		driver.get("https://the-internet.herokuapp.com/");
		// 20sec -  every 5 sec polling
		
		FluentWait<WebDriver> fw=new FluentWait<WebDriver>(driver);		// default timeout 30 sec
		fw.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("JavaScript Alerts"))));
		fw.pollingEvery(5,TimeUnit.SECONDS);
		fw.ignoring(NoSuchElementException.class);
		
		
		driver.findElement(By.linkText("JavaScript Alerts")).click();
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	}
}
