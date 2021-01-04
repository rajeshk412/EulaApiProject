package com.home.project.LivePerson;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import com.home.project.utilities.Constants;
import com.home.project.utilities.ExtentManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseTest {
	public ExtentReports extent = ExtentManager.getInstance();
	public ExtentTest test;

	@BeforeSuite
	public void loadConfig() throws IOException {
		Constants.loadConfigProp("Settings.properties");
	}

	@AfterTest
	public void quit() {
		if (extent != null) {
			extent.endTest(test);
			extent.flush();
		}
	}

}
