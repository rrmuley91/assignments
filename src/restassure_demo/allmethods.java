package restassure_demo;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import groovy.transform.stc.MapEntryOrKeyValue;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;
import java.util.HashMap;




public class allmethods {

@Test
public void getdata()

	{
		baseURI = "https://reqres.in/api";
		given().get("/users?page=2").then().statusCode(200).body("data[1].first_name", equalTo("Lindsay"));
	
	}
@Test
public void postdata()
{
	Map<String,Object> map = new HashMap<String,Object>();
	JSONObject request = new JSONObject();
	request.put("name", "rohit");
	request.put("job", "student");
	System.out.println(request.toJSONString());
	baseURI = "https://reqres.in/api";
	given().body(request.toJSONString()).
	when().post("/users").
	then().statusCode(201);
	
}

@Test
public void putdata()
{
	JSONObject request = new JSONObject();
	request.put("name", "rohit");
	request.put("job", "student");
	System.out.println(request.toJSONString());
	baseURI = "https://reqres.in/api";
	given().body(request.toJSONString()).
	when().post("users/2").
	then().statusCode(201);
}
@Test
public void deletedata()
{
	baseURI = "https://reqres.in/api";
	given().
	when()
	.delete("users/2")
	.then()
	.statusCode(204);
	
	
}
}


