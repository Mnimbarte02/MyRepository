package testNGKeywords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass {
  @Test
  public void a() {
	  Reporter.log("a is running",true); }
  @Test
  public void b() {
	  Reporter.log("b is running",true); 
  }
  @Test
  public void c() {
	  
	  Assert.fail();
	  Reporter.log("c is running",true); 
  }
  @Test
  public void d() {
	  
	  //Assert.fail();
	  Reporter.log("d is running",true); 
  }
}
