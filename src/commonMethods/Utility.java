package commonMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class Utility {
		//excelData
		//screenShot
		//click
		//scroll
		//wait-->implicity
	public static void scrollIntoView(WebDriver driver, WebElement element) 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
    public static void takeScreenShot(WebDriver driver,String fileName) throws IOException 
    {
    	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	Reporter.log("taking screenShot", true);
    	File dest=new File("C:\\Users\\nimba\\eclipse-workspaces\\March23_selenium\\screenShots"+fileName+".png");		
    	org.openqa.selenium.io.FileHandler.copy(src, dest);
    	
    }
	public static String readDataFromExcel(String filePath,String sheetName,int rowNum,int cellNum ) throws EncryptedDocumentException, IOException {
		FileInputStream myFile=new FileInputStream(filePath);
		String value = WorkbookFactory.create(myFile).getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
		
		return value;
	}
	
	public static void clickonelement() {
		
	}
		
	
	
	
	
}
