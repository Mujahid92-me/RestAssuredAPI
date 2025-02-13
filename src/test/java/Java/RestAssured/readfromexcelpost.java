package Java.RestAssured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import net.minidev.json.JSONObject;
import utils.excelutils;

public class readfromexcelpost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String excelpath ="C:\\Users\\Admin\\eclipse-workspace\\RestAssured\\src\\main\\java\\data\\Rest_Assured.xlsx";
		String sheetname="RestAssured";
		
		excelutils excel = new excelutils(excelpath,sheetname);
		
		
		JSONObject data = new JSONObject();
		data.put("name", excel.getCellData(3,0));
		data.put("job", excel.getCellData(3,1));
		
		given()
		.contentType("application/json; charset=utf-8")
		.body(data.toString())
		.when()
		   .post("https://reqres.in/api/users")
		.then()
		  .statusCode(201)
		 // .body("name", equalTo("Nouman"))
		  //.body("job", equalTo("Software engineer"))
		  .log().all();
	}

}
