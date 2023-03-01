package handling_special_elements;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowHandling {
	
	public static void main(String[] args) {
		//https://the-internet.herokuapp.com/windows
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//1. Go to //https://the-internet.herokuapp.com/windows
		driver.get("https://the-internet.herokuapp.com/windows");
		
		//getWindowHandle() -> returns string 
		String mainTab = driver.getWindowHandle();
		
		System.out.println(mainTab);
		
		//2. Click on "Click Here" 
		WebElement clcikHereLink = driver.findElement(By.linkText("Click Here"));
		clcikHereLink.click();
		
		//3. Switch to new window
		Set<String> tabs = driver.getWindowHandles();
		System.out.println(tabs);
		
		for (String tab : tabs) {
			
			if (!mainTab.equals(tab)) {
				driver.switchTo().window(tab);
			}
		}
		
		//4. Verify you are on new tab
		String newTabTitle = driver.getTitle();
		System.out.println(newTabTitle);
		if (newTabTitle.equals("New Window")) {
			
			System.out.println("Pass!");
		}else {
			System.out.println("Failed!");
		}
		
		//5. Switch to main tab
		driver.switchTo().window(mainTab);
		
		if (driver.getCurrentUrl().equals("https://the-internet.herokuapp.com/windows")) {
			
			System.out.println("Passed!");
		}else {
			
			System.out.println("Failed!");
		}
	}

}
