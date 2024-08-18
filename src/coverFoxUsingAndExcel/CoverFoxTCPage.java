package coverFoxUsingAndExcel;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import commonMethods.Utility;

public class CoverFoxTCPage {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		String filePath = "C:\\Users\\nimba\\OneDrive\\ExcelText1.xlsx";
		String age = Utility.readDataFromExcel(filePath, "Sheet4", 0, 0);
		String pinCode = Utility.readDataFromExcel(filePath, "Sheet4", 0, 1);
		String mobileNumber = Utility.readDataFromExcel(filePath, "Sheet4", 0, 2);
		
		//create object of homePage
		
		CoverFoxHomePage home=new CoverFoxHomePage(driver);
		home.clickOnGenderButton();
		
		CoverFoxHealthPlanPage healthPage=new CoverFoxHealthPlanPage(driver);
		healthPage.clickOnNextButton();
		
		CoverFoxMemberDetailsPage memberDetailsPage=new CoverFoxMemberDetailsPage(driver);
		memberDetailsPage.handleAgeDropDown(age);
		memberDetailsPage.clickOnNextButton();
		
		CoverFoxAddressDetailsPage addressDetailsPage=new CoverFoxAddressDetailsPage(driver);
		addressDetailsPage.enterPincode(pinCode);
		addressDetailsPage.enterMobileNumber(mobileNumber);
		addressDetailsPage.clickOnContinueButton();
		
		Thread.sleep(4000);
		
		CoverFoxResultPage resultPage=new CoverFoxResultPage(driver);
		resultPage.validateBanners();
		//driver.close();
	}

}
