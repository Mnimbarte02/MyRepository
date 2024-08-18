package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledTest {
  @Test
  public void a() {
	  Reporter.log("A is running", true);
  }
  
  @Test(enabled = false)
  public void b() {
	  Reporter.log("B is running", true);
  }
  @Test
  public void c() {
	 Reporter.log("C is running", true); 
  }
}
