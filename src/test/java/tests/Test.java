package tests;

import com.github.javafaker.Faker;

import pages.FormPage;
import utils.ConfReader;
import utils.Driver;

public class Test {

	public static void main(String[] args) {
		
		FormPage formPage = new FormPage();
		Driver.getDriver().get(ConfReader.get("url"));
		formPage.formFill("John Doe", "jdoe@gmail.com", "111 Elm st, Alexandria VA 12048", "111 Elm st, Alexandria VA 12048");
		
//		//1. Go to https://demoqa.com/text-box
//		Driver.getDriver().get("https://demoqa.com/text-box");
//		
//		//2. Enter fullName
//		formPage.fullNameInputBox.sendKeys("John Doe");
//		
//		//3. Enter email address
//		formPage.emailInputBox.sendKeys("jdow@mail.com");
//		
//		//4. Enter current address
//		String currentAddress = new Faker().address().fullAddress();
//		formPage.currentAddressInputBox.sendKeys(currentAddress);
//		
//		//5. Enter permanent address
//		String permanentAddress = new Faker().address().fullAddress();
//		formPage.permanentAddressInputBox.sendKeys(permanentAddress);
//		
//		//6. Click on submit button
//		formPage.submitButton.click();
		
	}

}
