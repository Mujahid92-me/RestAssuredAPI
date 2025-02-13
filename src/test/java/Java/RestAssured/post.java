package Java.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;



public class post{
	HashMap<String, String> map = new HashMap<String,String>();
	@BeforeTest
	public void postdata()
	{
		map.put("name", RestUtils.getName());
		map.put("job", RestUtils.job());
		RestAssured.baseURI = "https://reqres.in/api";
		RestAssured.basePath= "/users";
	}
	@Test
	public void posttest()
	{
		given()
		.body(map)
		
		.when()
		.post()
		.then()
		.statusCode(201)
		.log().all();
	}

}
