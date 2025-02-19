package coverFoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class CoverFoxMemberDetailsPage {
	@FindBy(name = "You")
	private WebElement ageDropDown;

	@FindBy(className = "next-btn")
	private WebElement next_btn;
	
	public CoverFoxMemberDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void handleAgeDropDown(String age) {
		Reporter.log("handeling dropdown",true);
		Select s =new Select(ageDropDown);
		s.selectByValue(age+"y");
	}
	public void clickOnNextButton() {
		Reporter.log("clicking on next button",true);
		next_btn.click();
	}

}
