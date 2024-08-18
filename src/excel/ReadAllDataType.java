package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadAllDataType {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myFile=new FileInputStream("C:\\Users\\nimba\\OneDrive\\ExcelText1.xlsx");
	
			Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
			//outer for loop-->row
			for(int i=0;i<=1;i++) {
				//inner for loop-->column
				for(int j=0;j<=2;j++) {
					Cell mycell = mySheet.getRow(i).getCell(j);
					CellType mycellType = mycell.getCellType();
					
					if(mycellType==CellType.NUMERIC) {
						double value = mycell.getNumericCellValue();
						System.out.print(value+" ");
					}
					else if(mycellType==CellType.BOOLEAN) {
						boolean value = mycell.getBooleanCellValue();
						System.out.print(value+" ");
					}
					
					else if(mycellType==CellType.STRING) {
						String value = mycell.getStringCellValue();
						System.out.print(value+" ");
					}
				
				}
				System.out.println();
			}
	
	}

}
