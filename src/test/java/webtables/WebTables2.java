package webtables;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTables2 {
	
	public static void main(String[] args) {
		// bookName - {"Learn Selenium", "Learn Java", "Learn JS", "Master In Selenium", "Master In Java", "Master In JS"}
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement headerBookName = driver.findElement(By.xpath("//table[@name='BookTable']//th[1]"));
		String headerBookNameText = headerBookName.getText();
		
		Map<String, ArrayList<String>> bookNameAndValues = new HashMap<>();
		ArrayList<String> bookNameTexts = new ArrayList<>();
		
		List<WebElement> bookNameElements = driver.findElements(By.xpath("//table[@name='BookTable']//tr/td[1]"));
		for (WebElement el : bookNameElements) {
			
			bookNameTexts.add(el.getText());
			
		}
		
		bookNameAndValues.put(headerBookNameText, bookNameTexts);
		
		System.out.println(bookNameAndValues);
	}

}
