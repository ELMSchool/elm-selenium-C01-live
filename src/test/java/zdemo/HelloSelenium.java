package zdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HelloSelenium {

	public static void main(String[] args) {

		// C:\Users\slymn\Downloads\chromedriver_win32\chromedriver.exe
		// Setting up chromedriver.exe

		/*
		 * invoke Google Chrome browser, 
		 * go to Google website by opening URL www.google.com, 
		 * type the value
		 * click on the Google search text box "elm school sdet courses"
		 * and hit 'Enter' key to visualize the results.
		 */

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\slymn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//Polymorphic way of creating object
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		//we are maximazing window
		driver.manage().window().maximize();
		
		//we are locating element
		WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
		
		//we are sending keys to search box and we are clicking enter
		searchBox.sendKeys("elm school sdet courses" + Keys.ENTER);
		
		
		

	}

}
