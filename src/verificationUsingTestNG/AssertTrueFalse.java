package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueFalse {
  @Test
  public void f() {
	  
	  boolean a=true;
	  boolean c=false;
	  
	//  Assert.assertTrue(a, "c value is false ,TC failed");
	  Assert.assertFalse(a, "value is true, TC is failed");
  }
}
