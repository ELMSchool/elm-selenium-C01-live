package browser_commands;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	
	//1. go to google.com
	//2. get current url
	//3. get get title
	//4. put them in a Map "title=apple", "url=kiwi"
	//5. close the browser
	
    public static void main(String[] args) {
    	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\slymn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
    	WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();

		Map<String, String> google = new HashMap<>();
		google.put("title", title);
		google.put("url", url);
		System.out.println(google);
		driver.close();
		
		
	}

}
