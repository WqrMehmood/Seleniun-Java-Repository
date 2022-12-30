package practice_tests;

import groovy.json.JsonException;
import io.restassured.RestAssured;
import static  io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import io.restassured.http.ContentType;
import io.restassured.matcher.RestAssuredMatchers.*;
import java.util.HashMap;
import java.util.Map;
import org.json.simple.JSONObject;
import org.hamcrest.Matchers.*;
//import org.testing.Assert;
import io.restassured.response.Response;
//import org.json.JSONException;
//import org.json.JSONString;
import org.junit.Assert;
import org.testng.annotations.Test;


public class Get_and_Post_Examples {

  @Test
  public  void GetTestRequest(){

    baseURI="https://reqres.in/";

    given().
        get("/api/users?page=2").
        then().
        statusCode(200).
        body("data[4].first_name",equalTo("George")).
        body("data.first_name",hasItems("George","Rachel","Tobias"));

  }

  @Test
  public void Post_Request() throws JsonException {

//  Method to put data simply
    Map<String, Object> mape = new HashMap();

//    mape.put("name", "Raghav");
//    mape.put("job","Teacher");
//    mape.put("Salary","25000");

    // System.out.println(mape);

    //method to convert the data into Json format

    JSONObject request = new JSONObject(mape);

    request.put("name","Raghav");
    request.put("Job","Teacher");
    request.put("Salary","25000");

    System.out.println(request.toJSONString());

    baseURI="https://reqres.in/";

    given().
        header("Content-Type","application/json").
        contentType(ContentType.JSON).
        accept(ContentType.JSON).
        body(request.toJSONString()).
        when().
        post("/api/users").
        then().
        statusCode(201).
        log().all();

  }



}




