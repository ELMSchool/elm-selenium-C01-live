package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

	// private constructor, so we can't create any other object of this class
	private Driver() {
	}

	private static WebDriver driver;

	public static WebDriver getDriver() {

		if (driver == null) {

			String browser = ConfReader.get("browser");

			switch (browser) {

				case "chrome":
					WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();
					driver.manage().window().maximize();
				break; 	
				
				case "chromeHeadless":
					WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
					break;
					
				case "firefox":
					WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver();
					driver.manage().window().maximize();
				break;
				
				case "firefoxHeadless":
					WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver(new FirefoxOptions().setHeadless(true));
					break;
				
				case "edge":
					WebDriverManager.edgedriver().setup();
					driver = new EdgeDriver();
					driver.manage().window().maximize();
				break;
				
				case "safari":
					WebDriverManager.safaridriver().setup();
					driver = new SafariDriver();
					driver.manage().window().maximize();
				break;
			}

		}
		
		return driver;

	}
	
	public static void closeDriver() {
		
		if (driver!=null) {
			
			driver.quit();
			
			driver = null;
		}
	}

}
