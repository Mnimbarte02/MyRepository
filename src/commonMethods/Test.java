package commonMethods;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement myElement = driver.findElement(By.xpath("//legend[text()='Mouse Hover Example']"));
		Thread.sleep(1000);
		Utility.scrollIntoView(driver, myElement);
		Utility.takeScreenShot(driver,"MyFile");
		
		WebElement textBox = driver.findElement(By.id("name"));
		String fileName="C:\\Users\\nimba\\OneDrive\\ExcelText1.xlsx";
		String myData = Utility.readDataFromExcel(fileName, "Sheet3", 2, 0);
		textBox.sendKeys(myData);
	}
	

}
