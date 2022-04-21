package OrangeHRM;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlesDemo {

	public static void main(String[] args) {
		WebDriverManager.chromiumdriver().setup();		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		
		String parentWindow=driver.getWindowHandle();
		
		driver.findElement(By.className("mTxt")).click();
		
		driver.findElement(By.className("mTxt")).click();
		System.out.println(parentWindow);
		
		Set<String> windows=driver.getWindowHandles();
		
		for(String w:windows) {
			if(!parentWindow.equals(w)) {
			driver.switchTo().window(w);
			System.out.println(driver.getTitle());
			}
		}
		
		//driver.switchTo().defaultContent();

		driver.switchTo().window(parentWindow);
		
		driver.quit();
		driver.manage().window().maximize();
	}

}
