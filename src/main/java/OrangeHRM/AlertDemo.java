package OrangeHRM;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertDemo {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromiumdriver().setup();		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("JavaScript Alerts")).click();
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		
		Alert alert=driver.switchTo().alert();
		alert.accept();
		String expected="You successfully clicked an alert";
		String actual=driver.findElement(By.xpath("//p[@id='result']")).getText();
		
		System.out.println(actual);
		assert expected.equals(actual);
		
		
		driver.findElement(By.xpath("//*[text()='Click for JS Confirm']")).click();
		Alert alert1=driver.switchTo().alert();
		alert1.dismiss();
		String expected1="You clicked: Cancel";
		String actual1=driver.findElement(By.xpath("//p[@id='result']")).getText();
		
		System.out.println(actual1);
		assert expected1.equals(actual1);
		
		driver.findElement(By.xpath("//*[text()='Click for JS Prompt']")).click();
		
		Alert alert3=driver.switchTo().alert();
		alert3.sendKeys("vikku");
		alert3.accept();
		String expected3="You entered: pikku";
		String actual3=driver.findElement(By.xpath("//p[@id='result']")).getText();
		System.out.println(actual3);
		
		
		assert expected3.equals(actual3);
		
	}
}
