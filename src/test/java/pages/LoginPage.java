package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class LoginPage {
	
	public LoginPage() {PageFactory.initElements(Driver.getDriver(), this);}
	
	@FindBy(id="userName")
	WebElement userNameInputBox;
	
	@FindBy(id="password")
	WebElement passwordInputBox;
	
	@FindBy(id="login")
	WebElement loginButton;
	
	@FindBy(id="newUser")
	WebElement newUserButton;
	
	public void login(String userName, String password) {
		
		userNameInputBox.sendKeys(userName);
		passwordInputBox.sendKeys(password);
		loginButton.click();
	}
}
