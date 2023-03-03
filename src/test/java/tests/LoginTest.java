package tests;

import pages.LoginPage;
import utils.ConfReader;
import utils.Driver;

public class LoginTest {
	
	public static void main(String[] args) {
		
		
		//1. Go to https://demoqa.com/login
		Driver.getDriver().get(ConfReader.get("url"));
		
		//2. Login to BookStore
		new LoginPage().login(ConfReader.get("userName"), ConfReader.get("password"));
		
	}
	

}
