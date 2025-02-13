package Java.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import net.minidev.json.JSONObject;
public class JSON_post {
    @Test
	public void pojopost()
	{
    	JSONObject data = new JSONObject();
		data.put("name", "Mujahid");
		data.put("job", "QA");
		
		given()
		.contentType("application/json; charset=utf-8")
		.body(data.toString())
		.when()
		   .post("https://reqres.in/api/users")
		.then()
		  .statusCode(201)
		  .body("name", equalTo("Mujahid"))
		  .body("job", equalTo("Software engineer"))
		  .log().all();
		
	}

}
