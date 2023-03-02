package webtables;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTables3 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		//this map is a storage
		Map <String, ArrayList<String>> tableValues = new LinkedHashMap<>();
		
		List<WebElement> headerElements = driver.findElements(By.xpath("//table[@name='BookTable']//th"));
		//  //table[@name='BookTable']//tr/td[1]
		
		for (int i = 0; i < headerElements.size(); i++) {
			//will give me header each time
			String header = headerElements.get(i).getText(); //Author
			
			String xpathForColumnValues = "//table[@name='BookTable']//tr/td["+ (i+1) +"]"; //table[@name='BookTable']//tr/td[1]
			
			List<WebElement> columnValueELements = driver.findElements(By.xpath(xpathForColumnValues));
			ArrayList<String> colValueTexts = new ArrayList<>();
			
			for (WebElement colValue : columnValueELements) {
				
				colValueTexts.add(colValue.getText());  // [Amit, Mukesh, Animesh, Mukesh, Amod, Amit]
			}
														//
			tableValues.put(header, colValueTexts); //{BookName=[Learn Selenium, Learn Java, Learn JS, Master In Selenium, Master In Java, Master In JS]
													// Author=[Amit, Mukesh, Animesh, Mukesh, Amod, Amit]	
													//	}
		}
		
		System.out.println(tableValues);
	}

	/*{
			Price=[300, 500, 300, 3000, 2000, 1000], 
			BookName=[Learn Selenium, Learn Java, Learn JS, Master In Selenium, Master In Java, Master In JS], 
			Author=[Amit, Mukesh, Animesh, Mukesh, Amod, Amit], 
			Subject=[Selenium, Java, Javascript, Selenium, JAVA, Javascript]
			}
    */
}
