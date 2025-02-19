package restassure_demo;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class restassured {																																																													
	
	@Test
	public void test()
	{
	Response Resp = get("https://reqres.in/api/users?page=2");
	System.out.println(Resp.getStatusCode());
	System.out.println(Resp.getBody().asString());
	int statuscode = Resp.getStatusCode();
	
	Assert.assertEquals(statuscode,200);
	}
	
	@Test
	public void test1()
	{
		baseURI = "https://reqres.in/api";
		given().get("/users?page=2").then().statusCode(200).body("data[1].first_name", equalTo("Lindsay"));
		
		
	}
	
}
