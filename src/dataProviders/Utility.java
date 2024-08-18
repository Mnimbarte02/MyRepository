package dataProviders;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class Utility {
		@DataProvider(name="cricketPlayers")
		public String[][] myData() throws IOException{
			String testData[][]= readDataFromExcel("ExcelText1","Sheet5");
			return testData;
		}
		
	public static String[][] readDataFromExcel(String excelFileName,String sheetName) throws IOException  {
		
		 
		 String path = System.getProperty("user.dir")+"\\"+excelFileName+".xlsx";
		 FileInputStream myFile=new FileInputStream(path);
			Sheet mySheet= WorkbookFactory.create(myFile).getSheet(sheetName);
			int rowCount=mySheet.getLastRowNum();
			int cellCount=mySheet.getRow(0).getLastCellNum()-1;
			System.out.println(rowCount);
			System.out.println(cellCount);
			String data[][]=new String[rowCount +1][cellCount +1];
			for(int i=0;i<=rowCount;i++) {
				for(int j=0;j<=cellCount;j++) {
					String value= mySheet.getRow(i).getCell(j).getStringCellValue();
					
					data[i][j]=value;
			}
		}
		return data;
	}
		public static String readDataFromPropertiesFile(String key) throws IOException {
			FileInputStream myFile=new FileInputStream(System.getProperty("user.dir")+"\\fbTest.properties");
			Properties prop=new Properties();
			prop.load(myFile);
			 String value = prop.getProperty(key);
			 return value;
		}
}
