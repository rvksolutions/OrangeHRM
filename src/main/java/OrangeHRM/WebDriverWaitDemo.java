package OrangeHRM;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitDemo {

	public static void main(String[] args) {


		WebDriverManager.chromiumdriver().setup();		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("JavaScript Alerts")).click();
		
		WebDriverWait wdw=new WebDriverWait(driver, 100);
		
		wdw.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("JavaScript Alerts"))));
		wdw.pollingEvery(5,TimeUnit.SECONDS);
		wdw.ignoring(NoSuchElementException.class);


	}}
