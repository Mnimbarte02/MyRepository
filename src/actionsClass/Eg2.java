package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Eg2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//click action using Actions class
		//1. Find the target element and store in ref variable
		WebElement radio1Button = driver.findElement(By.cssSelector("input[value=radio1]"));
		
		//2.Create an object of Actions class and pass Webdriver object as parameter
		Actions act =new Actions(driver);
		
		//3.Perfrom action
		//act.moveToElement(radio1Button).click().build().perform();
		act.click(radio1Button).perform();
		
		
		
	}

}
