package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathStudy {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://auth.discoveryplus.in/login");
		Thread.sleep(2000);
		//id-->
		WebElement MobileNumberField = driver.findElement(By.id("mobileNumber"));
		//name-->
		driver.findElement(By.name("mobileNumber"));
		
	}

}
