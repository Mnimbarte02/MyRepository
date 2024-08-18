package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullNotNull {
  @Test
  public void f() {
	  String a="abc";
	  String b=null;
	  
	 // Assert.assertNull(a, "value is not null,TC failed");
	  Assert.assertNotNull(a, "value is null,TC is failed");
	  Assert.fail();
  }
  
}
