package api.test;

import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import api.pojo.CharacterPojo;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetWalterWInfo {
	
	
	@Test
	public void getWWBirthday() {
		int charId = 1;
		
		Response response = RestAssured.given().get("https://breakingbadapi.com/api/characters/"+charId+"");
		Gson gson = new GsonBuilder().create();
        CharacterPojo[] character = gson.fromJson(response.asString(), CharacterPojo[].class);
		
        for(CharacterPojo c: character) {
        	System.out.println("Character Name: "+c.getName());
        	System.out.println("Birthday: "+c.getBirthday());
        }
	}
}
