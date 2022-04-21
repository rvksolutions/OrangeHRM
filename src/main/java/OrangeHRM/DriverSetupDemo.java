package OrangeHRM;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSetupDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\eclipse-workspace\\OrangeHRM\\Drivers\\chrome\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.close();
		
		
		System.setProperty("webdriver.gecko.driver","F:\\eclipse-workspace\\OrangeHRM\\Drivers\\gecko\\geckodriver.exe");
		FirefoxDriver driver1 = new FirefoxDriver();
		driver1.get("https://www.google.com");
		driver1.close();
	}
}
