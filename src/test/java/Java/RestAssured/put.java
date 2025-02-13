package Java.RestAssured;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class put {
	public static HashMap map = new HashMap();
	
	String empname=RestUtils.getName();
	String empJob= RestUtils.job();
	int id =3;
	@BeforeTest 
	public void testput()
	{
		map.put("name", empname);
		map.put("job", empJob);
		
		RestAssured.baseURI="https://reqres.in/api";
		RestAssured.basePath="/users/"+id;
		
	}
	@Test
	public void posttest()
	{
		given()
		.body(map)
		
		.when()
		.put()
		.then()
		.statusCode(200)
		.log().all();
	}

	
	

}
