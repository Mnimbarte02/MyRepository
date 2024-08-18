package dropDown_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Eg2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/signup");
		Thread.sleep(2000);
		
		//1.Identify list box to be handled and store it in reference variable
		WebElement day = driver.findElement(By.cssSelector("select#day"));
		
		//2.create =an object of select class which will accept WebElement as argument
		Select sday=new Select(day);
		
		//3.By Using one Of The select class method we can select values from list box like
		sday.selectByValue("2");
		
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.id("month"));
		Select sMonth=new Select(month);
		sMonth.selectByVisibleText("Aug");
		
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select sYear=new Select(year);
		sYear.selectByValue("1997");
		
		//to check if drop down is multi selectable or not
		System.out.println(sYear.isMultiple());
		
		
	}

}
