package popUp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://secure.indeed.com/auth");
		Thread.sleep(1000);
	String myText = driver.findElement(By.xpath("//h1[contains(text(),'Ready to take')]")).getText();
	System.out.println(myText);
	
	//clicking on login with google
	driver.findElement(By.xpath("//span[contains(text(),'Google')]")).click();
	
	String windowMainPage = driver.getWindowHandle();
	System.out.println(windowMainPage);
	
	Set<String> allWindowIds = driver.getWindowHandles();
	System.out.println(allWindowIds);
	
	//change set-->Array list
	ArrayList<String> al= new ArrayList<String>(allWindowIds);
	
	//String mainPageId=al.get(0);//main page id
	//String childPageId=al.get(1);//child page id
	
	Iterator<String> it = al.iterator();
	 String mainPageId=it.next();
	 String childPageId=it.next();
	 
	 //to take action on child page switch to child window
	 driver.switchTo().window(childPageId);
	 driver.manage().window().maximize();
	 
	 //sending email id on child page field
	  Thread.sleep(1000);
	 
	  driver.findElement(By.id("identifierId")).click();
	  driver.findElement(By.id("identifierId")).sendKeys("Test1234@gmail.com");
	  Thread.sleep(1000);
	  System.out.println(driver.findElement(By.xpath("//span[text()='Sign in']")).getText());
	  driver.close();
	  
	  //again switching to main page
	  driver.switchTo().window(mainPageId);
	  System.out.println(driver.findElement(By.xpath("//label[contains(text(),'Email')]")).getText());
			 
	  
	  
	 
	 
	 
	
	
	}

}
