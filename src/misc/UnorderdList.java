package misc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderdList {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("cafe");
		Thread.sleep(1000);
		 List<WebElement> results= driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		
		System.out.println(results.size());//10
		
		//for each
		for( WebElement r:results)
		{
		 System.out.println(r.getText());
		}
		Thread.sleep(1000);
		
		
		String required = "cafe peter";
		
		for(WebElement r:results)
		{
			String actualText = r.getText();
			Thread.sleep(1000);
			if(actualText.equals(required))
			{
				r.click();
				break;
			}
		}
		
		
		
	}

}
