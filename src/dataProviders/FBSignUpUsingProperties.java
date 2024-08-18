package dataProviders;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FBSignUpUsingProperties {
  @Test
  public void f() throws InterruptedException, IOException {
	  
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	String url = Utility.readDataFromPropertiesFile("url");
	
	 driver.get("https://www.facebook.com/signup");
	 driver.findElement(By.name("firstname")).sendKeys(Utility.readDataFromPropertiesFile("FirstName"));
	 driver.findElement(By.name("lastname")).sendKeys(Utility.readDataFromPropertiesFile("LastName"));
	 driver.findElement(By.name("reg_email__")).sendKeys(Utility.readDataFromPropertiesFile("MobNum"));
	 Thread.sleep(2000);
	 driver.close();
  }
}
