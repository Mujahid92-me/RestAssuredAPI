package Java.RestAssured;



import static org.junit.jupiter.api.Assertions.*;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;



public class FirstTest {
    
  @Test
  public void bdd() {
    given().when()
    .get("https://reqres.in/api/users?page=2")
    .then()
    .statusCode(200)
    .log().all()
    .assertThat().body("page",equalTo(5));
      
  }
}
