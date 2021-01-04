package com.home.project.utilities;




import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class Constants 
{
	
	private static Properties prop = new Properties();
	public static String apiendpointForEula; 
	public static String apiHealthUrl; 
	public static String tenant;
	
	
	public static final String REPORTS_PATH =System.getProperty("user.dir")+"//Reports";
	
	public static void loadConfigProp(String propertyFileName) throws IOException
			 {
		 FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//Resources//"+propertyFileName);
		 prop.load(fis);
		 apiendpointForEula=prop.getProperty("apiendpointForEula");
		 apiHealthUrl=prop.getProperty("apiHealthUrl");
		 tenant=prop.getProperty("tenant");
		 
		
		
	}
	
	

}
