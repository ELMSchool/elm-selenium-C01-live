package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameDemo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\slymn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
    	WebDriver driver = new ChromeDriver();
    	
    	driver.get("https://testautomationpractice.blogspot.com/");
    	
    	WebElement header = driver.findElement(By.tagName("h1"));
    	
    	//getText() - returns the text of WebElement as a String
    	System.out.println(header.getText());
	}

}
