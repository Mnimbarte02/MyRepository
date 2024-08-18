package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass {
  @Test
  public void f() {
	  System.out.println("Hi");
	  Reporter.log("Hi am mayuri");
	  Reporter.log("How are you",true);
	  Reporter.log("This is new report", false);
  }
  @Test
  public void f1() {
	  System.out.println("Good Morning");
  }
  
}