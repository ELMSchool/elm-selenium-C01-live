package browser_commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\slymn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	
		WebDriver driver = new ChromeDriver();

		//get(String url) -> loads web page in existing browser window
		driver.get("https://elm.school");
		
		
		//getTitle() -> gets the title of Current web page
//		String title = driver.getTitle();
//		System.out.println("Title is: "+ title);
//		if (title.equals("ELM")) {	
//			System.out.println("Passed");
//		}else {
//			System.out.println("Failed!!!");
//		}
//		
		
		//getCurrentUrl() -> fetches the current url of web page
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
		//getPageSource() -> returns the source code(complete HTML document) of current web page
		String pageSource = driver.getPageSource();
//		System.out.println(pageSource);
		
		
		//close() -> terminates current browser window
//		driver.close();
		
		
		//quit() -> terminates all windows operated by WebDriver
		driver.quit();
	}
	
	
	

}
