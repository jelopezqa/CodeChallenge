package api.test;

import org.testng.annotations.Test;

import api.utils.RESTUtils;



public class GetInfoCharacters extends RESTUtils {
	
	
	@Test
	public void getInfoChars() {
		getName();
	}
	
	@Test
	public void getWWBirthday() {
		gettingBdayWW();
		
		
	}
	
}


