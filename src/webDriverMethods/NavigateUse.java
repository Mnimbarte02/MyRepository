package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateUse {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.redbus.in/");
		
		driver.navigate().to("https://www.redbus.in/");
		

	}

}
