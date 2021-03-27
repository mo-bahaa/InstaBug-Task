package FACEBOOK.TESTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterPageModel extends DriverBase {
	
	public RegisterPageModel(WebDriver driver) {
		super(driver);
	}


	@FindBy(xpath = "//*[@data-testid=\"open-registration-form-button\"]") //login button  xpath in login form 
	public  WebElement CreateNewAccountButton;

	@FindBy(xpath = "//*[@name=\"firstname\"]") //First name in sign up form 
	public  WebElement FirstName;

	@FindBy(xpath = "//*[@name=\"lastname\"]") //sur name in sign up form 
	public  WebElement SurName;

	@FindBy(xpath = "//*[@name=\"reg_email__\"]") //mobile number in sign up form
	public  WebElement MobNumber;

	@FindBy(xpath = "//*[@name=\"reg_passwd__\"]") //password in sign up form
	public  WebElement newPassword;
	
	@FindBy(xpath = "//*[@id=\"year\"]") //password in sign up form
	public  WebElement Year;
	
	@FindBy(xpath = "//*[@id=\"month\"]") //password in sign up form
	public  WebElement Month;
	
	@FindBy(xpath = "//*[@id=\"day\"]") //password in sign up form
	public  WebElement Day;
	

}
