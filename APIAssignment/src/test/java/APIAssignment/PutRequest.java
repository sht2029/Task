package APIAssignment;

import org.testng.annotations.Test;
import static com.jayway.restassured.RestAssured.*;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import APIAssignment.APIAssignment.Post;


public class PutRequest {
	@Test
	public void test() {
		RestAssured.baseURI = "https://staging.refinemirror.com/static/swagger/";
		given().param("workout_uuid", "gQXXqhx6RGerdTk2Q_W5SA").when().get(baseURI).then().assertThat().statusCode(200)
				.and().header("content-length", "3494").and().header("Accept-Ranges", "bytes").and()
				.header("Connection", "keep-alive").and().header("content-type", "text/html; charset=UTF-8").and()
				.header("server", "Apache/2.4.23 (Amazon) mod_wsgi/3.5 Python/3.4.3");
		Post post = new Post();
		post.setDifficulty("3");
		post.setTrainer_rating("4");

		Response resp = given().when().contentType(ContentType.JSON).body(post)
				.put("https://staging.refinemirror.com/static/swagger/");
		System.out.println("PUT Request :" + resp.toString());
		System.out.println("Request is executed successfully");

	}
 
}
