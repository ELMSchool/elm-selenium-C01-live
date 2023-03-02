package webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTables4 {
	
	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		List< Map<String, String> > main = new ArrayList<>();
		
		//locating all headers
		List<WebElement> headerElements = driver.findElements(By.xpath("//table[@name='BookTable']//th"));
		
		//get row count
		int rowCount = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		
		for (int i = 0; i<rowCount-1; i++) {
			
			Map <String, String> rowMap = new LinkedHashMap<>(); //{}
			
			for (int k=0; k<headerElements.size(); k++) {
				
				String cellXpath = "//table[@name='BookTable']//tr[" + (i+2) +  "]/td[" + (k+1) + "]";
				String headerKey = headerElements.get(k).getText(); 
				String cellValue = driver.findElement(By.xpath(cellXpath)).getText();
				rowMap.put(headerKey, cellValue);
				
			}
			main.add(rowMap);
		}
		System.out.println(main.get(0).get("Price"));
	}

}
