package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutTest {
  @Test(timeOut = 5000)
  public void a() throws InterruptedException
  {
	  Thread.sleep(1000);
	  Reporter.log("A is running", true);
  }
}
