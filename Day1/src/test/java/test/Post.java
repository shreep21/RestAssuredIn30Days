package test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Post {
	@Test
	public void postMethod() {
		baseURI="https://www.google.com/maps";		
		given().
			post().
		then().
			statusCode(200);
		
	}
}
/*Since real time data needs a proper authentication and authorization to post a request, 
 * we will use dummy rest services www.reqres.inthe upcoming tutorials
 */ 
