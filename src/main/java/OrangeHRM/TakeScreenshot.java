package OrangeHRM;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("File Upload")).click();
		
		// (interface) - type cast
		 File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);		 
		 String path="F:\\eclipse-workspace\\OrangeHRM\\upload.jpg";		 
		 File destination=new File(path);
		 FileUtils.copyFile(screenshotFile,destination);
		 
		 String screenshotBase64 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
		
	}
	
}
