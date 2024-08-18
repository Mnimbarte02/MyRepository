package coverFoxPOM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import webElementMethods.WebElementMethods;

public class CoverFoxResultPage {
	@FindBy(xpath = "//div[contains(text(),'Insurance Plans')]")
	private WebElement resultText;

	@FindBy(className = "plan-card-container")
	private List<WebElement> banners;
	
	@FindBy (xpath="//div[text()='Sort Plans']")
	private WebElement sortPlanFilter;

	public CoverFoxResultPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void validateBanners() {
		Reporter.log("getting string results",true);
		String[] ar = resultText.getText().split(" ");
		int result = Integer.parseInt(ar[0]);
		Reporter.log("getting total banners",true);
		if (result == banners.size()) {
			System.out.println("Result is matching with banners, TC passed");
			} else {
			System.out.println("Result is not matching with banners, TC failed");
			}
			
		}
	public int getPlanNumberFromString() {
		
		String[] ar = resultText.getText().split(" ");
		Reporter.log("getting getplanNumbersFromString ",true);
		int result = Integer.parseInt(ar[0]);
		return result;
	}
	public int getPlanNumberFromBanners()
	{
		int bannerSize = banners.size();
		Reporter.log("getting getplanNumbersFromBanners ",true);
		return bannerSize;
	}
	public boolean sortPlanButtonIsDisplayed() {
		Reporter.log("checking sortPlanButtonIsDisplayed ",true);
		boolean result = sortPlanFilter.isDisplayed();
		return result;
	}
	
}
