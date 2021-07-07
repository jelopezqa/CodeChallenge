package api.utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RESTUtils {
	
	public Response get(String url) {
		return RestAssured.given()
		//.log().all()
		.get(url);
	}
	
	

}
