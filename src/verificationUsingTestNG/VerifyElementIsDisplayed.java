package verificationUsingTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VerifyElementIsDisplayed {
  @Test
  public void fbTest() {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/signup");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
	  WebElement customGender = driver.findElement(By.xpath("//input[contains(@id,'u_0_6')]"));
	  boolean result = customGender.isDisplayed();
	  
	// if (result) {
	// Reporter.log("CustomGender is present,TC failed", true);
	//
	// } else {
	// Reporter.log("CustomGender is not present, TC is passed", true);
	// }
	  
	  Assert.assertFalse(result);
	 
  }
}
