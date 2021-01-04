package com.home.project.LivePerson;

import java.io.IOException;

import org.testng.annotations.Test;

import com.home.project.pages.GetEulaDetails;
import com.home.project.utilities.UtilityMethods;
import com.relevantcodes.extentreports.LogStatus;

public class GetEulaDetailsTestCase extends BaseTest {
	@Test
	public void getEulaDeatailsForvalidtenant() throws IOException {
		test = extent.startTest(new Throwable().getStackTrace()[0].getMethodName());
		GetEulaDetails gd = new GetEulaDetails();
		String healthStatus = gd.validateHealthStatus();
		if (healthStatus.equals("200")) {
			UtilityMethods.assertForSuccess(test, "The status code displayed is correct , hence proceeding"+healthStatus,
					healthStatus, 200);
			gd.getEulaDetails();
			test.log(LogStatus.INFO, "Getting eula details" + " "+GetEulaDetails.eulaDetails.get("eula"));

		}
		else
		{
			UtilityMethods.assertForFailure(test, "The status code displayed is Incorrect"+healthStatus,
					healthStatus, 200);
		}

	}

}
