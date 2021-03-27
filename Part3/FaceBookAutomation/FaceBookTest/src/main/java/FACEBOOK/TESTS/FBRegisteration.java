package FACEBOOK.TESTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

public class FBRegisteration extends DriverBase {
	
	
	
	public FBRegisteration(WebDriver driver) {
		super(driver);
	}

	
	/*
	 * in below function i passed name , surname , mob and password to function to sign up
	 */
	public void Register(String NAME, String SUR, String Mob, String Password) throws Exception {
		driver.navigate().to("https://www.facebook.com/");
		RegisterPageModel loginPageModel =  new RegisterPageModel(driver);
		loginPageModel.CreateNewAccountButton.click();
		WebDriverWait waiting = new WebDriverWait(driver, 5);
		waiting.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"password_step_input\"]")));
		loginPageModel.FirstName.sendKeys(NAME);
		loginPageModel.SurName.sendKeys(SUR);
		loginPageModel.MobNumber.sendKeys(Mob);
		loginPageModel.newPassword.sendKeys(Password);
		Select YesrList = new Select(loginPageModel.Year); //birthday year
		YesrList.selectByVisibleText("1990");
		Select MonthList = new Select(loginPageModel.Month); //month birthday
		MonthList.selectByVisibleText("Feb");
		Select DayList = new Select(loginPageModel.Day); //day birthday
		DayList.selectByVisibleText("9");

		driver.findElement(By.xpath("//*[contains(text(),'Male')]")).click();// for female

		waiting.until(ExpectedConditions.elementToBeClickable((By.xpath("//*[@name=\"websubmit\"]"))));
		WebElement SignUp = driver.findElement(By.xpath("//*[@name=\"websubmit\"]"));
		
		Actions actions = new Actions(driver);

		actions.moveToElement(SignUp).click().perform();
	}
}
