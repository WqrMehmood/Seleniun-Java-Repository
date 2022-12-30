package practice_tests;

import io.restassured.RestAssured;
import static  io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import io.restassured.http.ContentType;
import io.restassured.matcher.RestAssuredMatchers.*;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Handler;
import org.json.simple.JSONObject;
import org.hamcrest.Matchers.*;
//import org.testing.Assert;
import io.restassured.response.Response;
//import org.json.JSONException;
//import org.json.JSONString;
import org.junit.Assert;
import org.testng.annotations.Test;
//import org.junit.Test;
//import org.junit.platform.commons.logging.Logger;

public class Tests_On_Local_API {

  @Test
  public  void Get_Request(){

    baseURI="http://localhost:3000/";

    given().
        get("/Users").
        then().
        statusCode(200).
        log().all();
    given().
        get("/Subjects").
        then().
        statusCode(200).
        log().all();

  }


  @Test
  public  void Get_with_Params() {

    baseURI = "http://localhost:3000/";

    given().
        param("Name","DevOps").
        get("/Subjects").
        then().
        statusCode(200).
        log().all();

  }

  @Test
  public void Post_Request() {

    JSONObject object = new JSONObject();

    object.put("id","5");
    object.put("firstName", "George");
    object.put("lastName", "Mork");
    object.put("salary", "15000");
    object.put("age", "28");

    baseURI="http://localhost:3000";

    given().
        contentType(ContentType.JSON).
        accept(ContentType.JSON).
        body(object.toJSONString()).
        when().
        post("/Users").
        then().
        statusCode(201).
        log().all();


  }


  @Test
  public void Put_Request (){

    JSONObject object = new JSONObject();


    object.put("firstName", "David");
    object.put("lastName", "Fork");
    object.put("salary", "35000");
    object.put("subjectID", "2");
    object.put("age", "30");

    baseURI="http://localhost:3000";

    given().
        contentType(ContentType.JSON).
        accept(ContentType.JSON).
        body(object.toJSONString()).
        when().
        put("/Users/5").
        then().
        statusCode(200).
        log().all();


  }

  @Test
  public void Patch_Request(){

    JSONObject object = new JSONObject();


    object.put("firstName", "Grid");


    baseURI="http://localhost:3000";

    given().
        contentType(ContentType.JSON).
        accept(ContentType.JSON).
        body(object.toJSONString()).
        when().
        patch("/Users/3").
        then().
        statusCode(200).
        log().all();


  }



  @Test
  public void Delete_Request(){

    baseURI="http://localhost:3000";


    when().
        delete("/Users/8UVz2S9").
        then().
        statusCode(200).
        log().all();


  }

}


