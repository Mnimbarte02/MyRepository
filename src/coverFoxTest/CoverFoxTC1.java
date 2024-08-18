package coverFoxTest;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import coverFoxBase.Base;
import coverFoxPOM.CoverFoxAddressDetailsPage;
import coverFoxPOM.CoverFoxHealthPlanPage;
import coverFoxPOM.CoverFoxHomePage;
import coverFoxPOM.CoverFoxResultPage;
import coverFoxUsingAndExcel.CoverFoxMemberDetailsPage;
import coverFoxUtility.Utility;

public class CoverFoxTC1 extends Base{
	
	
	CoverFoxHomePage homePage;
	CoverFoxHealthPlanPage healthPlanPage;
	CoverFoxAddressDetailsPage addressDetailsPage;
	CoverFoxMemberDetailsPage memberDetailsPage;
	CoverFoxResultPage resultPage;
	String filePath;
	
	@BeforeTest
	public void launchBrowser() {
	
		openBrowser();
		homePage=new CoverFoxHomePage(driver);
		healthPlanPage=new CoverFoxHealthPlanPage(driver);
		addressDetailsPage=new CoverFoxAddressDetailsPage(driver);
		memberDetailsPage=new CoverFoxMemberDetailsPage(driver);
		resultPage=new CoverFoxResultPage(driver);
		filePath= "C:\\Users\\nimba\\OneDrive\\ExcelText1.xlsx";
		
	}
	@BeforeClass
	public void preConditions() throws InterruptedException, EncryptedDocumentException, IOException {
		homePage.clickOnGenderButton();
		Thread.sleep(1000);
		healthPlanPage.clickOnNextButton();
		Thread.sleep(1000);
		memberDetailsPage.handleAgeDropDown(Utility.readDataFromExcel(filePath, "Sheet4", 0, 0));
		memberDetailsPage.clickOnNextButton();
		Thread.sleep(1000);
		addressDetailsPage.enterPincode(Utility.readDataFromExcel(filePath, "Sheet4", 0, 1));
		addressDetailsPage.enterMobileNumber(Utility.readDataFromExcel(filePath, "Sheet4", 0, 2));
		addressDetailsPage.clickOnContinueButton();
	}
	
  @Test
  public void validateBanners() throws InterruptedException {
	  
	  Thread.sleep(4000);
	 int bannerPlanNumbers = resultPage.getPlanNumberFromBanners();
	 int stringPlanNumbers = resultPage.getPlanNumberFromString();
	  Assert.assertEquals(stringPlanNumbers, bannerPlanNumbers,"plans on banners not matching with result");
	  
	   }
  @Test
  public void validatePresenceOfButton() throws InterruptedException, IOException {
	  
	  Thread.sleep(4000);
	Assert.assertTrue(resultPage.sortPlanButtonIsDisplayed(),"Sort Plan filter is not displayed,TC is failed");
	Utility.takeScreenShot(driver, "validatePresenceOfButton");
  
  }
  @AfterClass
  public void closeBrowser() throws InterruptedException {
	 browserClose();
  }
}
