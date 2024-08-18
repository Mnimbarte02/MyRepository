package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertDrawBack {
  @Test
  public void f() {
	  
	  String a="Pune";
	  String b="Mumbai";
	  
	  Assert.assertEquals(a, b, "a and b are equal, TC is failed");
	  Assert.assertNotNull(b, "b is null, TC is Failed");
  }
}
