package misc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RatingsOnFlipKart {

	private static final String String = null;

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);

		driver.findElement(By.name("q")).sendKeys("iphone 14 pro");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);

	
String ratings =driver.findElement(By.xpath("((//div[contains(@class,'col')])[8]//span)[4]")).getText();

		System.out.println(ratings);

	}

}
