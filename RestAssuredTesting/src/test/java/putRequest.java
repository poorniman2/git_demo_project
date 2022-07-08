import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class putRequest {
	@Test
	public void putTest_01()
	{
	/*	Map<String,Object> map= new HashMap<String, Object>();
		map.put("name", "morpheus");
		map.put("job", "leader");
		System.out.println(map);
		JSONObject request= new JSONObject(map);
		System.out.println(request);
		System.out.println(request.toJSONString());
		*/
		
		//without using map
		
		JSONObject request1= new JSONObject();
		request1.put("name", "morpheus");
		request1.put("job", "zion resident");
		System.out.println(request1.toJSONString());
		given().header("Content-Type","application/json; charset=utf-8").contentType(ContentType.JSON).
		accept(ContentType.JSON).body(request1.toJSONString()).
		when().put("https://reqres.in/api/users/2").then().statusCode(200).log().all();
		
	}
	
	@Test
	public void patchTest_01()
	{
	/*	Map<String,Object> map= new HashMap<String, Object>();
		map.put("name", "morpheus");
		map.put("job", "leader");
		System.out.println(map);
		JSONObject request= new JSONObject(map);
		System.out.println(request);
		System.out.println(request.toJSONString());
		*/
		
		//without using map
		
		JSONObject request1= new JSONObject();
		request1.put("name", "morpheus");
		request1.put("job", "zion resident");
		System.out.println(request1.toJSONString());
		given().header("Content-Type","application/json; charset=utf-8").contentType(ContentType.JSON).
		accept(ContentType.JSON).body(request1.toJSONString()).
		when().patch("https://reqres.in/api/users/2").then().statusCode(200).log().all();
		
	}
}
