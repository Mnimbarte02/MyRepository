package misc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindNumberOfLinks {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(1000);
		
		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		
		//print how many links are there?
		System.out.println(totalLinks.size());
		
		//print all links
		
		//using for loop
		for(int i=0;i<=totalLinks.size()-1;i++)
		{
			System.out.println(totalLinks.get(i).getText());
		}
		
		
		
		
		
		
		
		
	}

}
