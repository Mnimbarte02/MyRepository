package testNGKeywords;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class InnvocationCountTest {
  @Test(invocationCount=4)
  public void mytest() {
	 Reporter.log("My test is running ", true); 
	  
  }
  
  @AfterMethod
  public void afterMethod() {
	 System.out.println("After method is running"); 
	  
  }

}
