package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class FormPage {
	
	public FormPage() {
		
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(id="userName")
	public WebElement fullNameInputBox;
	
	@FindBy(id="userEmail")
	public WebElement emailInputBox;
	
	@FindBy(id="currentAddress")
	public WebElement currentAddressInputBox;
	
	@FindBy(id="permanentAddress")
	public WebElement permanentAddressInputBox;
	
	@FindBy(id="submit")
	public WebElement submitButton;
	
	
	public void formFill(String fullName, String userEmail, String currentAddress, String permanentAddress) {
		
		fullNameInputBox.sendKeys(fullName);
		emailInputBox.sendKeys(userEmail);
		currentAddressInputBox.sendKeys(currentAddress);
		permanentAddressInputBox.sendKeys(permanentAddress);
		submitButton.click();
	}
	
}
