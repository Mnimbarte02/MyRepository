package seleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.discoveryplus.in/home");
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(6000));
	  
	  
	  //6000-->page load 2000,4000? save-->next execution 
	  driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		
		
		
		
	}

}
