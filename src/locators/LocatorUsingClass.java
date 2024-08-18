package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorUsingClass {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(1000);
		
		//class
	WebElement radioButton = driver.findElement(By.className("radioButton"));
		radioButton.click();
		
		//linkText
		WebElement openTabButton = driver.findElement(By.linkText("Open Tab"));
		//openTabButton.click();
		
		//partialLinkText
		driver.findElement(By.partialLinkText("Open")).click();
		
		//css-->tag and ID
		driver.findElement(By.cssSelector("button#openwindow")).click();
		

	}

}
