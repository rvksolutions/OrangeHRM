package OrangeHRM;

import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class howtoHandleWindows {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		
//				String parentWindowHandle = driver.getWindowHandle();
//				System.out.println("Parent window handle - "+parentWindowHandle + driver.getTitle());
//				driver.findElement(By.id("newWindowBtn")).click();
//				Set<String> windowHandles = driver.getWindowHandles();
//				for (String windowHandle : windowHandles) {
//					if(!windowHandle.equals(parentWindowHandle)) {
//						driver.switchTo().window(windowHandle);
//						driver.manage().window().maximize();
//						driver.findElement(By.id("firstName")).sendKeys("Sarath");
//						Thread.sleep(3000);
//						driver.close();
//						Thread.sleep(2000);
//					}
//				}
//				
//				driver.switchTo().window(parentWindowHandle);
//				driver.findElement(By.id("name")).sendKeys("Completed");
//				 
//				
//	}
//}
		
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("Parent window handle - "+parentWindowHandle + driver.getTitle());
		driver.findElement(By.className("whButtons")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowHandle : windowHandles) {
			if(!windowHandle.equals(parentWindowHandle)) {
				driver.switchTo().window(windowHandle);
				System.out.println(driver.findElement(By.id("output")).getText());
				driver.findElement(By.id("alertBox")).click();
				System.out.println(driver.switchTo().alert().getText());
				driver.switchTo().alert().accept();
				System.out.println(driver.findElement(By.id("output")).getText());
				Thread.sleep(3000);
				driver.close();
			}
		}

		driver.switchTo().window(parentWindowHandle);
		driver.findElement(By.id("name")).sendKeys("completed");

		Thread.sleep(3000);
		driver.quit();
	}
}