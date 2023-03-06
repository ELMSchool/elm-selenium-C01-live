package jse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.Driver;

public class JavaScriptExecutorDemo {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		JavascriptExecutor jse = (JavascriptExecutor)Driver.getDriver();
		jse.executeScript("return document.readyState").equals("complete");
		
		Driver.getDriver().get("https://www.amazon.com/");
	
		Thread.sleep(2000);

		WebElement privacyNoticeLink = Driver.getDriver().findElement(By.linkText("Privacy Notice"));
		
		WebElement searchBox = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
		
		
		type(Driver.getDriver(), searchBox, "shoes");
		
		
		
	}
	
	
	public static void scroll(WebDriver driver) throws InterruptedException {
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		for(int i = 0; i<10; i++) {
			
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		}
		
		
	}
	
	public static void scroll(WebDriver driver, WebElement element) throws InterruptedException {
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("arguments[0].scrollIntoView(true)", element);
		
		
	}
	
	public static void click(WebDriver driver, WebElement element) {
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("arguments[0].click()", element);
		
		
	}
	
	public static void type(WebDriver driver, WebElement input, String string) {
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("arguments[0].setAttribute('value', '"+string+"')", input);
		
		
	}

	
}
