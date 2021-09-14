package day3;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.io.IOException;
import org.testng.annotations.Test;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.http.ContentType;

public class PostWithPOJO {
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
	PojoClass PojoObject=new PojoClass();
	PojoObject.setNameString("Priya");
	PojoObject.setJobString("Senior Test Engineer");
	
	//Converting a Java pojo object to json payload string. Serialization
	ObjectMapper mapper=new ObjectMapper();
	try {
		String jsonString=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(PojoObject);
		//serialization ends here
		
		//Deserialization using ObjectMapper
		PojoClass PojoObject2=mapper.readValue(jsonString, PojoClass.class);
		//Posting the request
		given().	
			body(jsonString).
		when().
			post().
		then().
			statusCode(201);
		
	} catch (JsonProcessingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}
}
