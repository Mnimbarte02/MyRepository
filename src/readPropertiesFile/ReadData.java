package readPropertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadData {

	public static void main(String[] args) throws IOException {
		String filePath = System.getProperty("user.dir")+"//fbTest.properties";
		FileInputStream myFile=new FileInputStream(filePath);
		
		Properties prop=new Properties();
		prop.load(myFile);
		
		String value=prop.getProperty("LastName");
		System.out.println(value);
	}

}
