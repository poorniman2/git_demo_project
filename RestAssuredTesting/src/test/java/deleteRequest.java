import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class deleteRequest {
	@Test
	public void patchTest_01()
	{
	
		when().delete("https://reqres.in/api/users/2").then().statusCode(204).log().all();
		System.out.println("tetsing");
		System.out.println("tetsing");
		System.out.println("tetsing");
		
	}
}
