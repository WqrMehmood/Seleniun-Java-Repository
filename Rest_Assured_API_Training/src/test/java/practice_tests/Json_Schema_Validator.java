package practice_tests;

import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import org.testng.annotations.Test;

public class Json_Schema_Validator {

  @Test
  public  void GetTestRequest(){

    baseURI="https://reqres.in/";


    given().
        when().
        get("api/users?page=2").
        then().
        //Path entered in the last to validation
            assertThat().body(matchesJsonSchemaInClasspath("schema.json.json")).
        statusCode(200).log().all();




  }

}

