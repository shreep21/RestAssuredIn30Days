package day2;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostWithJsonBodyUsingJsonSimpleObject {
	/*
	 * We have to use libraries like Gson Library, JSON-Simple Library or Jackson Library
	 * for processing a json body in a post request
	 */
	/* 
	 * Simple JsonInput
	 * "name":"Priya"
	 * "job":"Senior Test Engineer"
	 * 
	 * baseURI: https://reqres.in/
	 * basePath: /api/users
	 */
	@Test
	public void post() {
		baseURI="https://reqres.in/api/users";	
		JSONObject object=new JSONObject(); //Json simple is used to create a new JSON object
		object.put("name", "Priya");  		//JsonObject acts like a map that accepts the inputs in Key Value pair
		object.put("job", "Senior Test Engineer");
		given().	
			body(object).
		when().
			post().
		then().
			statusCode(201);
		
	}
}
