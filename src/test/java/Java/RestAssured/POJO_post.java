package Java.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;
public class POJO_post {
    @Test
	public void pojopost()
	{
		POJO_data data = new POJO_data();
		data.setName("Mujahid");
		data.setJob("Software engineer");
		
		given()
		.contentType("application/json; charset=utf-8")
		.body(data)
		.when()
		   .post("https://reqres.in/api/users")
		.then()
		  .statusCode(201)
		  .body("name", equalTo("Mujahid"))
		  .body("job", equalTo("Software engineer"))
		  .log().all();
		
	}

}
