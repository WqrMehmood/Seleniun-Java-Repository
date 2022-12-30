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
//import org.junit.platform.commons.logging.Logger;

public class Put_Patch_Delete_Examples {

  @Test
  public void Put_Request() throws JsonException {


    //method to convert the data into Json format

    JSONObject request = new JSONObject();

    request.put("name","morpheus");
    request.put("Job","zion resident");

    System.out.println(request.toJSONString());

    baseURI="https://reqres.in/";

    given().
        header("Content-Type","application/json").
        contentType(ContentType.JSON).
        accept(ContentType.JSON).
        body(request.toJSONString()).
        when().
        put("/api/users/2").
        then().
        statusCode(200).
        log().all();
  }

  @Test
  public void Patch_Request() throws JsonException {


    //method to convert the data into Json format

    JSONObject request = new JSONObject();

    request.put("name","morpheus");
    request.put("Job","zion resident");

    System.out.println(request.toJSONString());

    baseURI="https://reqres.in/";

    given().
        header("Content-Type","application/json").
        contentType(ContentType.JSON).
        accept(ContentType.JSON).
        body(request.toJSONString()).
        when().
        patch("/api/users/2").
        then().
        statusCode(200).
        log().all();
  }

  @Test
  public void Delete_Request() throws JsonException {


    baseURI="https://reqres.in/";

    given().
        when().
        delete("/api/users/2").
        then().
        statusCode(204).
        log().all();
  }

}


