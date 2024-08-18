package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg1 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		//how many rows are there?
	List<WebElement> rows = driver.findElements(By.xpath("//table[@name='courses']//tr"));
		int TotalNumberOfRows = rows.size();
		System.out.println("Total rows in table are"  +TotalNumberOfRows);
		
		
		//how  many columns are there?
		List<WebElement> columns = driver.findElements(By.xpath("//table[@name='courses']//tr[1]/th"));
		int TotalNumbersColumns = columns.size();
		System.out.println("Total columns in table are" + TotalNumbersColumns);
		 
		
		//how to read particular data from table
		WebElement myelement = driver.findElement(By.xpath("//table[@name='courses']//tr[4]/td[2]"));
		String myText = myelement.getText();
		System.out.println(myText);
		
		//how to read particular row from table
		//table[@name='courses']//tr[5]/td[1]
		//table[@name='courses']//tr[5]/td[2]
		//table[@name='courses']//tr[5]/td[3]
		
		for(int i=1;i<=3;i++) 
		{
			WebElement element = driver.findElement(By.xpath("//table[@name='courses']//tr[5]/td["+i+"]"));
			String text = element.getText();
			System.out.println(text);
		}
			//how to read particular column from table
			for(int i=2;i<=TotalNumberOfRows;i++) {
				WebElement element1 = driver.findElement(By.xpath("//table[@name='courses']//tr["+i+"]/td[3]"));
				String Text = element1.getText();
				System.out.println(Text);
			}
		System.out.println("=======================================================");
				
		//how to read all table data -->excluding header
		//added header separatly
		
		for(int i=1;i<=TotalNumbersColumns;i++)
		{
			String header = driver.findElement(By.xpath("//table[@name='courses']//tr[1]/th["+i+"]")).getText();
			System.out.print(header+" ");
		}
		System.out.println();
		//outer for loop-->row
		
		for(int i=2;i<=TotalNumberOfRows;i++) 
		{
			//inner for loop-->columns
			for(int j=1;j<=TotalNumbersColumns;j++)
			{
				String myText1 = driver.findElement(By.xpath("//table[@name='courses']//tr["+i+"]/td["+j+"]")).getText();
			 System.out.print(myText1+" ");
			}
			System.out.println();
			
		}
		
				
				
	}
			
			
			
			
			
		
		
	}
	


