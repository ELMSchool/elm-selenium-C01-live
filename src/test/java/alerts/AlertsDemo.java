package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Driver;

public class AlertsDemo {

	public static void main(String[] args) throws InterruptedException {

		alertAccept1();

	}

	public static void alertAccept1() {

		Driver.getDriver().get("https://the-internet.herokuapp.com/javascript_alerts");

		WebElement jsAlert = Driver.getDriver().findElement(By.cssSelector("button[onclick='jsAlert()'] "));

		jsAlert.click();

		Alert alert = Driver.getDriver().switchTo().alert();

		String alertText = alert.getText();
		alert.accept();

		WebElement message = Driver.getDriver().findElement(By.id("result"));

		System.out.println(alertText);
		System.out.println(message.getText());

	}

	public static void alertAccept2() {

		Driver.getDriver().get("https://the-internet.herokuapp.com/javascript_alerts");

		WebElement jsConfirm = Driver.getDriver().findElement(By.cssSelector("button[onclick='jsConfirm()'] "));

		jsConfirm.click();

		Alert alert = Driver.getDriver().switchTo().alert();

		alert.accept();

		WebElement message = Driver.getDriver().findElement(By.id("result"));

		System.out.println(message.getText());

	}
	
	
	public static void alertDismiss() {

		Driver.getDriver().get("https://the-internet.herokuapp.com/javascript_alerts");

		WebElement jsConfirm = Driver.getDriver().findElement(By.cssSelector("button[onclick='jsConfirm()'] "));

		jsConfirm.click();

		Alert alert = Driver.getDriver().switchTo().alert();

		alert.dismiss();

		WebElement message = Driver.getDriver().findElement(By.id("result"));

		System.out.println(message.getText());

	}
	
	
	public static void alertSendkeys() {

		Driver.getDriver().get("https://the-internet.herokuapp.com/javascript_alerts");

		WebElement jsPromt = Driver.getDriver().findElement(By.cssSelector("button[onclick='jsPrompt()'] "));

		jsPromt.click();

		Alert alert = Driver.getDriver().switchTo().alert();

//		alert.sendKeys("Hello World");
		alert.dismiss();

		WebElement message = Driver.getDriver().findElement(By.id("result"));

		System.out.println(message.getText());

	}

}
