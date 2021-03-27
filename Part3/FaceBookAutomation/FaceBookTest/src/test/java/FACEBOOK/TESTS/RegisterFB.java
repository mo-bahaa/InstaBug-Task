package FACEBOOK.TESTS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

/*
 * Test case 1 register to fb account 
 */
@Test
public class RegisterFB extends HelperTest {

	FBRegisteration LoginFBObject;
	HelperTest baseTest = new HelperTest();
			
	public void test() throws Exception {
		LoginFBObject = new FBRegisteration(baseTest.InitializeDriver());
		LoginFBObject.Register("test", "user", "01226569451", "NT@nghy865334");

	}

}
