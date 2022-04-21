package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromiumdriver().setup();		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		// saving return value and perform operation
		WebElement e=driver.findElement(By.linkText("Checkboxes"));
		
		if(e.isEnabled()) {
			System.out.println("Element is enabled");
			e.click();
		}
		
		if(e.isDisplayed()) {
			System.out.println("Element Displayed");
		}
		
		// method chaining
		boolean flag=driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]")).isSelected();
		
		System.out.println(flag);
		
		if(!flag) {
			driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]")).click();
		}

		driver.findElement(By.xpath("//*[@id='checkboxes']/input[2]")).click();
	}

}
