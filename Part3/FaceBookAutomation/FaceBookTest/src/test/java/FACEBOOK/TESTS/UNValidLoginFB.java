package FACEBOOK.TESTS;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

/*
 * Test case 3 Sign in to fb account with un valid test user 
 */
@Test
public class UNValidLoginFB {

	public void test() throws Exception {
		HelperTest baseTest = new HelperTest();
		ReadTestUsersSheet readTestUsersSheet = new ReadTestUsersSheet(baseTest.InitializeDriver());
		readTestUsersSheet.ExcelFile(System.getProperty("user.dir")+"\\Test Data\\TestData-Wrong.xlsx", "Sheet1");

	}
	
	
	
}
