package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadWholeData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myFile= new FileInputStream("C:\\Users\\nimba\\OneDrive\\ExcelText1.xlsx");
	    
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
	    
		//row-->0,3, cell-->0-2
		//outer for loop-->row
		for(int i=0;i<=3;i++) {
			//inner for loop-->cell
			for(int j=0;j<=2;j++) {
				String value = mySheet.getRow(i).getCell(j).getStringCellValue();
			    System.out.print(value+" ");
			}
			System.out.println();
		}
	}

}
