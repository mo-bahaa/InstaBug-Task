package FACEBOOK.TESTS;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*
 * Test case 1 register to fb account 
 */

public class HelperTest {

	public ChromeDriver InitializeDriver() throws Exception {
		
		String chromePath = System.getProperty("user.dir")+"\\Resources\\chromedriver.exe";
		System.out.println(chromePath);
		System.setProperty("webdriver.chrome.driver", chromePath);
		ChromeOptions options = new ChromeOptions();
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		return driver;
		

	}
	
	

}
