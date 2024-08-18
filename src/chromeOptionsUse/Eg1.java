package chromeOptionsUse;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Eg1 {

	public static void main(String[] args) throws IOException {
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("start-maximized");
		//options.addArguments("incognito");
		options.addArguments("headless");
		
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Mayuri");
		
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File dest=new File("C:\\Users\\nimba\\OneDrive\\ScreenShot\\test1.png");
		 FileHandler.copy(src, dest);
	
	}

}
