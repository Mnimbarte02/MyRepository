package coverFoxUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CoverFoxMemberDetailsPage {

	@FindBy(name = "You")
	private WebElement ageDropDown;

	@FindBy(className = "next-btn")
	private WebElement next_btn;
	
	public CoverFoxMemberDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void handleAgeDropDown() {
		Select s =new Select(ageDropDown);
		s.selectByValue("24y");
	}
	public void clickOnNextButton() {
		next_btn.click();
	}
	
}

