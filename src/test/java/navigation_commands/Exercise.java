package navigation_commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise {
	
	public static void main(String[] args) {
		/*
		 * Go to google.com 
		 * Get title and store as a String 
		 * Then go to elm.school
		 * Get title and store as a String 
		 * Go back to google
		 * Get title and make sure it matches with String you have
		 * Go forward to Elm.school
		 * Get title and make sure it matches with String you have
		 * Then refresh page
		 * Close the window
		 * */
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\slymn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
    	WebDriver driver = new ChromeDriver();
    	
    	driver.navigate().to("https://www.google.com/");
		String titleGoogle = driver.getTitle();
		
		driver.navigate().to("https://elm.school/");
		String titleElm = driver.getTitle();
		
		driver.navigate().back();
		String titleGoogle2 = driver.getTitle();
		
		if(titleGoogle.equals(titleGoogle2)) {
			System.out.println("PASSED");
		}else {
			System.out.println("FAILED");
		}
		
		driver.navigate().forward();
		String titleElm2 = driver.getTitle();
		
		if(titleElm.equals(titleElm2)) {
			System.out.println("PASSED");
		}else {
			System.out.println("FAILED");
		}
		
		driver.navigate().refresh();//refreshes web page
		driver.close();
		
		
	}

}
