package handling_special_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.util.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VolunteerSignUp {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//1. Switch to iframe
		WebElement iframeElement = driver.findElement(By.id("frame-one1434677811"));
		driver.switchTo().frame(iframeElement);
		
		//2. Locate firstName input box and send keys "Jake"
		WebElement firstNameInputBox = driver.findElement(By.id("RESULT_TextField-1"));
		firstNameInputBox.sendKeys("Jake");
		
		//3. Locate firstName input box and send keys "Monroe"
		WebElement lastNameInputBox = driver.findElement(By.id("RESULT_TextField-2"));
		lastNameInputBox.sendKeys("Monroe");
		
		//4. Locate phone input box and send keys "9294567896"
		WebElement phoneInputBox = driver.findElement(By.id("RESULT_TextField-3"));
		phoneInputBox.sendKeys("9294567896");
		
		//5. Locate country input box and send keys "USA"
		WebElement countryInputBox = driver.findElement(By.id("RESULT_TextField-4"));
		countryInputBox.sendKeys("USA");
		
		//6. Locate city input box and send keys "USA"
		WebElement cityInputBox = driver.findElement(By.id("RESULT_TextField-5"));
		cityInputBox.sendKeys("Manhattan");
		
		//7. Locate email input box and send keys "jmonroe@mail.com"
		WebElement emailInputBox = driver.findElement(By.id("RESULT_TextField-6"));
		emailInputBox.sendKeys("jmonroe@mail.com");
		
		//8. Locate male radio button and click on it
		WebElement maleRadioButton = driver.findElement(By.cssSelector("label[for='RESULT_RadioButton-7_0']"));
		maleRadioButton.click();
		
		//9. Locate available days and check them
		WebElement sundayCheckbox = driver.findElement(By.cssSelector("label[for='RESULT_CheckBox-8_0']"));
		WebElement saturdayCheckbox = driver.findElement(By.cssSelector("label[for='RESULT_CheckBox-8_6']"));
		sundayCheckbox.click();
     	saturdayCheckbox.click();
     	
//isSelected() -> it checks if given checkbox/radio button is selected or not and returns boolean. It is a WebElement method		
		System.out.println(driver.findElement(By.id("RESULT_CheckBox-8_0")).isSelected());
		
		//10. Locate the dropdown and select "Afternoon"
		WebElement dropdownElement = driver.findElement(By.id("RESULT_RadioButton-9"));
		Select select = new Select(dropdownElement);		
//selectByVisibleText
		select.selectByVisibleText("Afternoon");
//selectByIndexNumber
		//select.selectByIndex(1);
//selectByValue		
		//select.selectByValue("Radio-2");

//getOptions will return all options from dropdown as a List<WebElement> 
//		List<WebElement> options = select.getOptions();
//		for (WebElement option : options) {
//			System.out.println(option.getText());
//		}
		
//handling dropdown without select tag
		List<WebElement> optionsFromDropdown = driver.findElements(By.cssSelector("#RESULT_RadioButton-9 > option"));
		//[option1, option2, option3, option4] 
		for (WebElement option : optionsFromDropdown) {
			
			if(option.getText().equals("Evening")) {
				
				option.click();
			}
		}
		
		//11. Locate file upload element and send the path of file
		WebElement uploadElement = driver.findElement(By.id("RESULT_FileUpload-10"));
		uploadElement.sendKeys("C:\\Users\\slymn\\OneDrive\\Documents\\FileUpload.txt");
		
		//12. Switch to default content
		driver.switchTo().defaultContent();
		
		//13. Drag and drop
		WebElement dragMe = driver.findElement(By.id("draggable"));
		WebElement dropHere = driver.findElement(By.id("droppable"));
		
		//Creating actions object
		Actions actions = new Actions(driver);
		actions.dragAndDrop(dragMe, dropHere).perform();
		
		//14. Locate and Double click
		WebElement copyTextButton = driver.findElement(By.cssSelector("button[ondblclick='myFunction1()']"));
		actions.doubleClick(copyTextButton).perform();
		
		//15. Verify text is copied to there
		
		
	}

}
