package com.home.project.pages;

import java.util.HashMap;

import com.home.project.utilities.API;
import com.home.project.utilities.Constants;
import com.home.project.utilities.Executor;
import com.home.project.utilities.Method;

import io.restassured.response.Response;

public class GetEulaDetails {


	public static HashMap<String, String> eulaDetails=new HashMap<String, String>();
	public String validateHealthStatus()
	{
		API api = new API(Method.GET, null, null, Constants.apiHealthUrl, null);
		String code=Executor.run(api).getBody().jsonPath().getString("code");
		return code;

	}


	public void getEulaDetails() 
	{
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("tenant", Constants.tenant);

		API api = new API(Method.GET, null, params, Constants.apiendpointForEula, null);
		Response response = Executor.run(api);
		eulaDetails.put("eula", response.getBody().jsonPath().getString("eula_b64"));
	
	}

	
}
