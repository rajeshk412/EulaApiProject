package com.home.project.utilities;



import java.io.File;
import java.io.IOException;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;


public class ExtentManager {
	
	public static ExtentReports extent;
	public static ExtentReports getInstance() 
	{	
		if (extent == null) {
			

			try {
				Constants.loadConfigProp("Settings.properties");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String fileName="ExecutionReport.html";
			String reportPath =Constants.REPORTS_PATH+"//"+fileName;
			
			extent = new ExtentReports(reportPath, true, DisplayOrder.NEWEST_FIRST);
			
			extent.loadConfig(new File(System.getProperty("user.dir")+"//ReportsConfig.xml"));
			// optional
		
			extent.addSystemInfo("Environment and URL",Constants.apiendpointForEula);
		
		}
		return extent;
	}
	
}
