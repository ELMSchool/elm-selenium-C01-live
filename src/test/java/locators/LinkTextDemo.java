package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\slymn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
    	WebDriver driver = new ChromeDriver();
    	
    	driver.manage().window().maximize();
    	driver.get("https://www.amazon.com/");
    	
    	WebElement newReleases = driver.findElement(By.linkText("New Releases"));
    	
    	//click on  element
    	newReleases.click();
    	
    	
	}
}
