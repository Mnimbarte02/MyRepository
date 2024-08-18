package dropDown_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Eg3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(1000);
		
		//1.
		WebElement multiSelectDropDown = driver.findElement(By.id("cars"));
		//2.
		Select s=new Select(multiSelectDropDown);
		//3.
		//check if multiple selectable or not?
		System.out.println(s.isMultiple());
		s.selectByIndex(0);
		s.selectByValue("saab");
		s.selectByVisibleText("Audi");
		
		//s.deselectAll();
		s.deselectByValue("volvo");
		s.deselectByIndex(1);
		s.deselectByVisibleText("Audi");
	
	}

}
