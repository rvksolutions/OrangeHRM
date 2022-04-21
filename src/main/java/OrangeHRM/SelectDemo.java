package OrangeHRM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDemo {

	public static void main(String[] args) {

		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/dropdown");

		// driver.findElement(By.id("dropdown")).click();

		Select select = new Select(driver.findElement(By.id("dropdown")));
		
		System.out.println(select.isMultiple());

		//driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		select.selectByValue("2");
		select.selectByIndex(1);
		select.selectByVisibleText("Option 1");
		
		/*
		 * select.deselectByIndex(1); select.deselectByValue("2");
		 * select.deselectByVisibleText("Option 2");
		 */
		
		//select.deselectAll();
		
		System.out.println(select.getFirstSelectedOption().getText());
		
		select.getAllSelectedOptions().size();

		List<WebElement> list=select.getOptions();
		
		for(int i=0;i<list.size();i++) {
			
			System.out.println(list.get(i).getText());
			
		}
	}
}
