package testNGXML;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest4 {
  @Test(groups = {"regression"})
  public void m() {
	  Reporter.log("M is running", true);
  }
  @Test(groups = {"sanity"})
  public void n() {
	  Reporter.log("N is running", true);
  }
  @Test(groups = {"sanity"})
  public void o() {
	  Reporter.log("O is running", true);
  }
  @Test(groups = {"regression"})
  public void p() {
	  Reporter.log("P is running", true);
  }
}
