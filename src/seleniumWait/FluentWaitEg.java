package seleniumWait;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitEg {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.discoveryplus.in/home");

FluentWait<WebDriver> w=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofMillis(15000)).pollingEvery(Duration.ofMillis(1000)).ignoring(NoSuchElementException.class);
		
		
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("(//h6[text()='Sign In'])[2]")));
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		
	}

}
