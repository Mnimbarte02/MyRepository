package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Eg4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		Thread.sleep(1000);
		
		//Scrolling
		
		//1.
		WebElement bookingSection = driver.findElement(By.xpath("//h1[text()='Book & Buy on Paytm.']"));
		
		//2.
		Actions act=new Actions(driver);
		
		//3.
		act.scrollToElement(bookingSection).perform();
	}

}
