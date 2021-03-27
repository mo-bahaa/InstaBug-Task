package FACEBOOK.TESTS;

import java.sql.Driver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
/*
 * Test case 2 Sign in to fb account with test user created by fb development app 
 */
@Test
public class ValidLoginFB {
	public void test() throws Exception {
		
		HelperTest baseTest = new HelperTest();
		ReadTestUsersSheet readTestUsersSheet = new ReadTestUsersSheet(baseTest.InitializeDriver());
		readTestUsersSheet.ExcelFile(System.getProperty("user.dir")+"\\Test Data\\TestData.xlsx", "Sheet1");
		

	}
	
   
}
 
