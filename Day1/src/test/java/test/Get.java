package test;

import static io.restassured.RestAssured.*;
import static io.restassured.response.Response.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class Get {
	@Test
	public void getMethod() {
		baseURI="https://www.google.com/maps";
				
		given().
			get().
		then().
			statusCode(200);
		
	}
}
