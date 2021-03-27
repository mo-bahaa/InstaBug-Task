package FACEBOOK.TESTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LoginPageModel extends DriverBase {
	
	public LoginPageModel(WebDriver driver) {
		super(driver);
	}


	@FindBy(xpath = "//*[@id=\"email\"]") //email xpath in login form 
	WebElement email;

	@FindBy(xpath = "//*[@id=\"pass\"]") //password xpath in login form 
	WebElement password;

	//button[@name='login']
	@FindBy(xpath = "//*[@name=\"login\"]") //login button  xpath in login form 
	WebElement LoginButton;

	
	

}
