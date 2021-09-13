package day2;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.google.common.collect.TreeMultiset;

import io.restassured.http.ContentType;

public class PostRequestUsingString {
// We are going to use Reqres.in for further learning of API automation usign Rest Assured
	/* 
	 * Simple JsonInput for Post Request
	 * "name":"Priya"
	 * "job":"Senior Test Engineer"
	 * 
	 * baseURI: https://reqres.in/
	 * basePath: /api/users
	 */
	@Test
	public void post() {
		baseURI="https://reqres.in/api/users";	
		String bodyString="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";
		System.out.println(bodyString);
		/*
		 * Though this line of code prints the json, it only provides a string output
		 * because, this is not a best practise to do in coding, (keeping the input hard-coded)
		 * lets see how to hide the Json input the next class. 
		 */
		given().	
			body(bodyString).
		when().
			post().
		then().
			statusCode(201);
		
	}
	}

