package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		//total number of rows
	 int totalRows = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).size();
		
	  //total number of columns
	int totalColumns = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr[1]/th")).size();
	
	   //outer for loop rows
	for(int i=1;i<=totalRows;i++)
	{
		//inner for loop columns
		for(int j=1;j<=totalColumns;j++) 
		{
			if(i==1)
			{
				String Text = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr["+i+"]/th["+j+"]")).getText();
			    System.out.print(Text+" ");
			}
			else {
				String text = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr["+i+"]/td["+j+"]")).getText();
			    System.out.print(text+" ");
			}
		}
		System.out.println();
	}
	
	
	}

}
