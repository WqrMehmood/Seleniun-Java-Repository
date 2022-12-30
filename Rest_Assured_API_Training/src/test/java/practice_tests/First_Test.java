package practice_tests;

import io.restassured.RestAssured;
import static  io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;
//import org.testing.Assert;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class First_Test {

  @Test
  public void Test_1(){

    Response response=get("https://reqres.in/api/users?page=2");

    System.out.println(response.getStatusCode()+ response.getTime()+response.getStatusLine()
        +response.getHeader("content-type")+response.getBody().asString());

    int StatusCode=response.getStatusCode();

    Assert.assertEquals(StatusCode,200);

  }

  //another method of getting API Response and validate
  @Test
  public void Test_2(){

    baseURI="https://reqres.in/";

    given().
        get("/api/users?page=2").
        then().
        statusCode(200).
        body("data[2].id",equalTo(9));
    //  log().all();


  }

}





