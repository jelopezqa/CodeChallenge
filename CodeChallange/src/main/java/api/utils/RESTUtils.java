package api.utils;

import static io.restassured.RestAssured.given;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import api.pojo.CharacterPojo;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class RESTUtils {
	
	public void getName() {
		
		Response response = RestAssured.given().get("https://breakingbadapi.com/api/characters");
		Gson gson = new GsonBuilder().create();
        CharacterPojo[] character = gson.fromJson(response.asString(), CharacterPojo[].class);
		
        for(CharacterPojo c: character) {
        	System.out.println("Character Name: "+c.getName());
        	System.out.println("Portrayed: "+c.getPortrayed());
        	System.out.println("------------------------------------------");
        }
	}
	
	public void gettingBdayWW() {
		RestAssured.baseURI = "https://www.breakingbadapi.com";
		RestAssured.basePath = "/api/characters";
		String name = "Walter White";
		Response response = given()
				.queryParam("name", name)
				.contentType(ContentType.JSON).log().body().get();
		//response.prettyPrint();
		JsonPath extractor = response.jsonPath();
		String id = extractor.get("char_id").toString();
		id = id.replace("[", "").replace("]","");
		response = given().get("https://www.breakingbadapi.com/api/characters/"+id+"");
		String bday = extractor.get("birthday").toString();
		System.out.println("The Walter White's birthday: "+bday.replace("[", "").replace("]",""));
	}
}
