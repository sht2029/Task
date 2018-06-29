package APIAssignment;

import org.testng.annotations.Test;
import static com.jayway.restassured.RestAssured.*;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;

import APIAssignment.APIAssignment.Post;

public class PatchRequest {
	@Test

	public void Test() {
		RestAssured.baseURI = "https://staging.refinemirror.com/static/swagger/";
		given().param("workout_uuid", "gQXXqhx6RGerdTk2Q_W5SA").

				when().get(baseURI).then().assertThat().statusCode(200).and().header("content-length", "3494").and()
				.header("Accept-Ranges", "bytes").and().header("Connection", "keep-alive").and()
				.header("content-type", "text/html; charset=UTF-8").and()
				.header("server", "Apache/2.4.23 (Amazon) mod_wsgi/3.5 Python/3.4.3");
		Post post = new Post();
		post.setExercise_position("925");
		post.setTimestamp("1503947145");
		post.setValue("145");
		given().body(post).when().contentType(ContentType.JSON).patch(baseURI);
		System.out.println("PATCH Request :" + post.toString());
		System.out.println("Request is executed successfully");
	}

}
