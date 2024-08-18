package coverFoxUsingPOM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoverFoxTC {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		// create object of homePage
		CoverFoxHomePage home = new CoverFoxHomePage(driver);
		home.clickOnGenderButton();
		CoverFoxHealthPlanPage healthPlanPage = new CoverFoxHealthPlanPage(driver);
		healthPlanPage.clickOnNextButton();

		CoverFoxMemberDetailsPage memberDetailsPage = new CoverFoxMemberDetailsPage(driver);

		memberDetailsPage.handleAgeDropDown();
		memberDetailsPage.clickOnNextButton();

	}

}
