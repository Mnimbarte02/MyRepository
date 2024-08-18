package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Mayuri");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("class");
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@id,'u_0_4')]")).click();
		
	  String myText = driver.findElement(By.xpath("//div[contains(text(),'Create a ')]")).getText();
		System.out.println(myText);
	}

}
