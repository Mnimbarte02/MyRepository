package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Mayuri");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Nimbarte");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("mayurinimbarte@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("12345@A");	
		
		//driver.get("https://paytm.com/");
		//	driver.findElement(By.xpath("//h1[text()='Recharge & Pay Bills on Paytm.']"));
		
		
		
		
	}

}
