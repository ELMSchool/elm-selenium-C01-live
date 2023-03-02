package webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandling {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//1. https://testautomationpractice.blogspot.com/
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//2. Get all headers
		List<WebElement> headerElements = driver.findElements(By.xpath("//table[@name='BookTable']//th"));
		for (WebElement header : headerElements) {
			
			System.out.println(header.getText());
		}
		
		
		//3. Get all BookNames from given table
		String expectedBookNames [] = {"Learn Selenium", "Learn Java", "Learn JS", "Master In Selenium", "Master In Java", "Master In JS"};
		
		List<WebElement> bookNameElements = driver.findElements(By.xpath("//table[@name='BookTable']//tr/td[1]"));
		int counter =0;
		
		for (WebElement bookName : bookNameElements) {
			
			if (!expectedBookNames[counter].equals(bookName.getText())) {
				
				System.out.println("Failed!");
				break;
			}
			
			counter++;
		}
		
		
	}

}
