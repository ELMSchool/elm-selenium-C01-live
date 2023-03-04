package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Driver;

public class ExplicitWait {
	
	public static void main(String[] args) {
		
		Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Driver.getDriver().get("https://the-internet.herokuapp.com/dynamic_loading/2");
		
		
		Driver.getDriver().findElement(By.tagName("button")).click();
		
		
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
		
		WebElement loading = Driver.getDriver().findElement(By.id("loading"));
		
		wait.until(ExpectedConditions.invisibilityOf(loading));
	
		 WebElement message = Driver.getDriver().findElement(By.id("finish"));

	     System.out.println(message.getText());
	     
	     Driver.closeDriver();
		
	}

}
