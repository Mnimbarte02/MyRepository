package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//locate your excel file
		
		FileInputStream myFile= new FileInputStream("C:\\Users\\nimba\\OneDrive\\ExcelText1.xlsx");
		
		String value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		System.out.println(value);
		
	}

}

