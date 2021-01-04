package com.home.project.utilities;

import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class UtilityMethods 
{
	public static void assertForSuccess(ExtentTest test,String message,Object actual,Object expected)
	{
		test.log(LogStatus.INFO, "Getting the execution status");
		test.log(LogStatus.PASS, message);

	}
	public static void assertForFailure(ExtentTest test,String message,Object actual,Object expected)
	{
		test.log(LogStatus.INFO, "Getting the execution status");
		test.log(LogStatus.FAIL, message);
		Assert.assertEquals(actual, expected);
	}

}
