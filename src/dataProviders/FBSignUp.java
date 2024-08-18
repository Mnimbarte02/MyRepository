package dataProviders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FBSignUp {
  @Test(dataProvider="cricketPlayers",dataProviderClass=dataProviders.Utility.class)
  public void f(String name, String lastName, String mobNum) throws InterruptedException {
	  
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	 driver.get("https://en-gb.facebook.com/signup");
	 driver.findElement(By.name("firstname")).sendKeys(name);
	 driver.findElement(By.name("lastname")).sendKeys(lastName);
	 driver.findElement(By.name("reg_email__")).sendKeys(mobNum);
	 Thread.sleep(2000);
	 driver.close();
  }
}
