package APIAssignment;

import org.testng.annotations.Test;


import com.jayway.restassured.RestAssured;
import static com.jayway.restassured.RestAssured.*;

public class GetResponse {
	@Test
	public void Test_01(){
		
		RestAssured.baseURI = "https://staging.refinemirror.com/static/swagger/";
		given().
		 param("offset", "2").
		
		 when().
		 get(baseURI).
		 then().assertThat().statusCode(200).and().
		 header("content-length", "3494").and().
		 header("Accept-Ranges", "bytes").and().
		 header("Connection", "keep-alive").and().
		 header("content-type", "text/html; charset=UTF-8").and().
		 header("server", "Apache/2.4.23 (Amazon) mod_wsgi/3.5 Python/3.4.3");
		 System.out.println("Request is executed successfully");
	}
	@Test
public void Test_02(){
		
		 RestAssured.baseURI = "https://staging.refinemirror.com/static/swagger/";
		 given().
		 param("offset", "3").
		 param("limit", "2").
		 when().
		 get(baseURI).
		 then().assertThat().statusCode(200).and().
		 header("content-length", "3494").and().
		 header("Accept-Ranges", "bytes").and().
		 header("Connection", "keep-alive").and().
		 header("content-type", "text/html; charset=UTF-8").and().
		 header("server", "Apache/2.4.23 (Amazon) mod_wsgi/3.5 Python/3.4.3");
		 System.out.println("Request is executed successfully");
	}
	
 
}
