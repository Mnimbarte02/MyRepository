package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlTitle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		Thread.sleep(1000);
		
		String myTital = driver.getTitle();
		System.out.println(myTital);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
	}

}
