package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdDemo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\slymn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
    	WebDriver driver = new ChromeDriver();
    	
    	driver.get("https://testautomationpractice.blogspot.com/");
		
    	
    	//locating element by id
    	WebElement searchBox = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
    	

		
   
	}

}
