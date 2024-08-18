package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Eg3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(1000);
		
		//drag and drop
		//1. find Element and store ref variable
		WebElement source = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement target = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Thread.sleep(1000);
		
		//2.
		Actions act=new Actions(driver);
		
		//3.
		//act.dragAndDrop(source, target).perform();
		act.clickAndHold(source).moveToElement(target).release().build().perform();
	
	}

}
