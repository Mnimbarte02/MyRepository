
package coverFoxUsingAndExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class CoverFoxAddressDetailsPage{
	
	
	@FindBy(className = "mp-input-text")
	private WebElement pinCodeField;
	
	@FindBy(id = "want-expert")
	private WebElement mobileNumberField;
	
	@FindBy(className = "next-btn")
	private WebElement continueButton;
	
	public CoverFoxAddressDetailsPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	public void enterPincode(String pincodeValue) {
	pinCodeField.sendKeys(pincodeValue);
	}
	public void enterMobileNumber(String mobileNumber) {
	mobileNumberField.sendKeys(mobileNumber);
	}
	public void clickOnContinueButton() {
	continueButton.click();
	}

}
