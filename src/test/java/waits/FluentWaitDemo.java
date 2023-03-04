package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


import utils.Driver;

public class FluentWaitDemo {

	
	public static void main(String[] args) {
		
		Driver.getDriver().get("https://the-internet.herokuapp.com/dynamic_loading/2");
		
		
		Driver.getDriver().findElement(By.tagName("button")).click();
		
		Wait wait = new FluentWait(Driver.getDriver()).withTimeout(Duration.ofSeconds(30))
					.pollingEvery(Duration.ofSeconds(3))
					.ignoring(NoSuchElementException.class);
		
		

		
		WebElement loading = Driver.getDriver().findElement(By.id("loading"));
		wait.until(ExpectedConditions.invisibilityOf(loading));
		
		WebElement message = Driver.getDriver().findElement(By.id("finish"));

	     System.out.println(message.getText());
		
		
	}
}
