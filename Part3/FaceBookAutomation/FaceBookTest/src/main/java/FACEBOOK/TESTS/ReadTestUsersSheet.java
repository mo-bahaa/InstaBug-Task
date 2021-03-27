package FACEBOOK.TESTS;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReadTestUsersSheet extends DriverBase
 
{

	public ReadTestUsersSheet(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	/*
	 * public ReadTestUsersSheet(WebDriver driver) { super(driver); // TODO
	 * Auto-generated constructor stub }
	 */
	String USER;
	String PASS;

	public void ExcelFile(String path, String sheetName) throws IOException {

		
        FileInputStream file = new FileInputStream(new File(path));

		// creating workbook instance that refers to .xls file
		XSSFWorkbook wb = new XSSFWorkbook(file);

		// creating a Sheet object
		XSSFSheet sheet = wb.getSheet(sheetName);

		// get all rows in the sheet
		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();

		// iterate over all the row to print the data present in each cell.
		for (int i = 1; i <= rowCount; i++) {

			// get cell count in a row
			int cellcount = sheet.getRow(i).getLastCellNum();

 //below function to open fb account and read test users data and password from excel sheet 
			
			
			for (int j = 1; j < cellcount; j++) {
				System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() + ",");
				String user = sheet.getRow(i).getCell(0).getStringCellValue();
				String userpassword = sheet.getRow(i).getCell(1).getStringCellValue();
				driver.navigate().to("https://www.facebook.com/");
				LoginPageModel loginPageModel = new LoginPageModel(driver);
				WebDriverWait waiting = new WebDriverWait(driver, 5);
				waiting.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"pass\"]")));
				loginPageModel.password.sendKeys(userpassword);
				loginPageModel.email.sendKeys(user);
				loginPageModel.LoginButton.click();
			
			}
			

		}

	}
	
	
	
}


	   