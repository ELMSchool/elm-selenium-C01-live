package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Driver;

public class StaticWait {
	
	public static void main(String[] args) {
		
		
		Driver.getDriver().get("https://the-internet.herokuapp.com/dynamic_controls");
		
		WebElement enableDisableButton = Driver.getDriver().findElement(By.cssSelector("button[onclick='swapInput()']"));
		enableDisableButton.click();
		
		try {
			Thread.sleep(6000);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		WebElement textInputBox = Driver.getDriver().findElement(By.cssSelector("input[type='text']"));
		textInputBox.sendKeys("Hello World!");
		
		
	}

}
