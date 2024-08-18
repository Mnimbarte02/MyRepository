package chromeOptionsUse;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notification {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		//options.addArguments("disable-notifications");
		//If we Want  to pass multiple arguments-->create an object of list
		ArrayList<String>al=new ArrayList<String>();
		al.add("disable-notifications");
		al.add("start-maximized");
		al.add("incognito");
		
		options.addArguments(al);
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.justdial.com/");
		Thread.sleep(1000);
	}

}
