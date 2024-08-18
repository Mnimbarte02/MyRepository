package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethod {
  @Test
  public void f1() {
	  Reporter.log("Test Method1 is running", true);
  }
 
  @Test
  public void f2() {
	  Reporter.log("Test Method2 is running", true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("before method is running", true);
  }
  @AfterMethod
  public void afterMethod() {
	  Reporter.log("after method is running", true);
  }
  
}
