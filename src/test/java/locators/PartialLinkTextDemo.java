package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextDemo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\slymn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
    	WebDriver driver = new ChromeDriver();
    	
    	driver.manage().window().maximize();
    	driver.get("https://www.amazon.com/");
    	
    	//locating element with paritalLinkText
    	WebElement newReleases = driver.findElement(By.partialLinkText("New"));
    	newReleases.click();
	}

}
