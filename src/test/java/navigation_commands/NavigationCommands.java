package navigation_commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\slymn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
    	WebDriver driver = new ChromeDriver();
		
		//navigate().to() -> It allows borwser to load a new page within existing browser window
    	driver.navigate().to("https://www.google.com/");
    	
    	//navigate().back() ->
    	driver.navigate().to("https://elm.school");
    	driver.navigate().back();
		
    	
    	//navigate().forward() ->
    	driver.navigate().forward();
    	
    	//navigate().refresh() ->
    	driver.navigate().refresh();
	}
	
}
