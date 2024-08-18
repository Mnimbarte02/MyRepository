package dataProviders;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderTest {
 
	@DataProvider(name="teacher")
	public String[][]myData()  {
		String data[][]= {{"Mayuri","Nimbarte","9657118220"},{"Anurag","Nimbarte","9604286546"},{"Mayur","Bhoyar","8888577230"}};
		
		return data;
		
	}
	@DataProvider(name="student")
	public String[][]myData1(){
		String data[][]= {{"Tanay","Nimbarte","9584947695"},{"Vaidahi","Sapate","8485729574"}};
	
				
		return data;
		
	}
  
}
