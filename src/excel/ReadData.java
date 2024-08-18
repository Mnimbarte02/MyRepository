package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myFile=new  FileInputStream("C:\\Users\\nimba\\OneDrive\\ExcelText1.xlsx");
		
	    Workbook myWorkBook = WorkbookFactory.create(myFile);
	    Sheet mySheet = myWorkBook.getSheet("Sheet1");
	  	Row myRow = mySheet.getRow(0);
	  	Cell myCell = myRow.getCell(0);
	  	CellType dataType = myCell.getCellType();
	  	//System.out.println(dataType);
	    String value = myCell.getStringCellValue();
	     System.out.println(value);
	}

	
	

}
