package com.comcast.crm.generic.fileutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility 
{
	public String getDataFromPropertiesFile(String key) throws IOException
	{
		FileInputStream fis= new FileInputStream("./configAppData/selenium_ddt.properties");
		Properties pobj= new Properties();
		pobj.load(fis);
		String data=pobj.getProperty(key);
		return data;
	}

}
