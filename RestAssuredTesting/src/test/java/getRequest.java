import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class getRequest {

	@Test
	void test_01()
	{
		Response response=get("https://reqres.in/api/users?page=2");
		System.out.println(response.asString());
		System.out.println("status code is "+response.getStatusCode());
		System.out.println("response body is  "+response.getBody());
		System.out.println("response status line is  "+response.getStatusLine());
		System.out.println("response header is  "+response.getHeader("content-type"));
		System.out.println("response time is  "+response.getTime());
	}
	@Test
	void test_02()
	{
		given().get("https://reqres.in/api/users?page=2").then().statusCode(200);
		given().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data.id[0]", equalTo(7));
	}
		
}
