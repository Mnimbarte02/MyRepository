package testNGXML;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest5 {
  @Test
  public void q() {
	  Reporter.log("Q is running", true);
  }
  @Test(groups = {"regression"})
  public void r() {
	  Reporter.log("R is running", true);
  }
  @Test(groups = {"sanity"})
  public void s() {
	  Reporter.log("S is running", true);
  }
  @Test(groups = {"sanity"})
  public void t() {
	  Reporter.log("T is running", true);
  }
}
