package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameDemo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Frames")).click();
		driver.findElement(By.linkText("Nested Frames")).click();
		
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-left");
		String leftframe=driver.findElement(By.xpath("//body[normalize-space('LEFT')]")).getText();
		System.out.println( leftframe);
		driver.switchTo().defaultContent();
		
		String frametop=driver.findElement(By.name("frame-top")).getAttribute("name");
		System.out.println(frametop);
	}

}
