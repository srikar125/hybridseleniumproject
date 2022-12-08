package genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertieFileData {

	public String data(String key) throws Exception
	{
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(autoconstant.properfilepath);
		p.load(fis);
		return p.getProperty(key);
		
	}
}
