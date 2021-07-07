package api.test;

import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import api.pojo.CharacterPojo;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetInfoCharacters {
	
	
	@Test
	public void getInfoChars() {
		Response response = RestAssured.given().get("https://breakingbadapi.com/api/characters");
		Gson gson = new GsonBuilder().create();
        CharacterPojo[] character = gson.fromJson(response.asString(), CharacterPojo[].class);
		
        for(CharacterPojo c: character) {
        	System.out.println("Character Name: "+c.getName());
        	System.out.println("Portrayed: "+c.getPortrayed());
        	System.out.println("------------------------------------------------------");
        }
	}
	
}


