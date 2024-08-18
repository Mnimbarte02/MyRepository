
package coverFoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
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
	Reporter.log("entering pin code",true);	
	pinCodeField.sendKeys(pincodeValue);
	}
	public void enterMobileNumber(String mobileNumber) {
	Reporter.log("entering Mobile Number",true);		
	mobileNumberField.sendKeys(mobileNumber);
	}
	public void clickOnContinueButton() {
	Reporter.log("clicking on next button",true);	
	continueButton.click();
	}

}
