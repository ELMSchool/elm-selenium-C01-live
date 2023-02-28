package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameDemo {

	
	public static void main(String[] args) {
		//field-keywords
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\slymn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
    	WebDriver driver = new ChromeDriver();
    	
    	//we are going amazon web page
    	driver.get("https://www.amazon.com/");
    	
    	WebElement searchAmazon = driver.findElement(By.name("field-keywords"));
    	searchAmazon.sendKeys("iphone 14");
	}
}
