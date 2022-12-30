package practice_tests;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import java.util.Iterator;
//import org.json.JSONException;
import org.json.simple.JSONObject;
//import org.junit.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Driven_Examples {

   /* @DataProvider(name="DataForPost")
  public Object[][] data_for_post(){

    //how to post data using arrays in rows and columns
    Object[][] obj=new Object[2][3];  //2 columsns and 3 rows data

    obj[0][0]= "Albert";
    obj[0][1]= "Echison";
    obj[0][2]= 23;

    obj[1][0]= "Thomas";
    obj[1][1]= "Edward";
    obj[1][2]= 89;

    return obj;*/

//another way to provide data
   /* return new Object[][]{
        {"Graham","Bell",1},
        {"Henry","Ford",2}

    };

  }*/


  @Test(dataProvider = "DataForPost")
  public void Test_post(String firstname, String lastname, int subjectID) {

    JSONObject object = new JSONObject();

    object.put("firstName", firstname);
    object.put("lastName", lastname);
    object.put("subjectid", subjectID);

    baseURI = "http://localhost:3000";

    given().
        contentType(ContentType.JSON).
        accept(ContentType.JSON).
        header("Content-Type", "application/json").
        body(object.toJSONString()).
        when().
        post("/Users").
        then().
        statusCode(201).
        log().all();


  }


  //how to delete multiple data using data driven
  @DataProvider(name = "DeleteData")
  public Object[] data_form_delete() {
    return new Object[] {

        6,7,8

    };
  }

  @Test(dataProvider = "DeleteData")
  public void test_delete ( int userID){

    baseURI = "http://localhost:3000";

    given().
        when().
        delete("/Users/" + userID).
        then().
        statusCode(204).
        log().all();

  }


}


