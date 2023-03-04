package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class RegistrationPage {
	
	public RegistrationPage() {PageFactory.initElements(Driver.getDriver(), this);}
	
	@FindBy(id="firstname")
	WebElement firstNameInputBox;
	
	@FindBy(id="lastname")
	WebElement lastNameInputBox;
	
	@FindBy(id="userName")
	WebElement userNameInputBox;
	
	@FindBy(id="password")
	WebElement passwordInputBox;
	
	@FindBy(id="register")
	WebElement registerButton;


}
