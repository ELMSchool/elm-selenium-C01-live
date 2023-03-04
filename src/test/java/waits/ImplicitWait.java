package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.Driver;

public class ImplicitWait {
	
	public static void main(String[] args) {
		
		
		Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Driver.getDriver().get("https://the-internet.herokuapp.com/dynamic_loading/2");

		Driver.getDriver().findElement(By.tagName("button")).click();

        WebElement message = Driver.getDriver().findElement(By.id("finish"));

        System.out.println(message.getText());
	}

}
