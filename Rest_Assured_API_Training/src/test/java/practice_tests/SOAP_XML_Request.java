package practice_tests;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.apache.commons.io.IOUtils;
import org.testng.annotations.Test;

public class SOAP_XML_Request {

  @Test
  public void validateSOAPxml() throws IOException {

    //To add external XML file for validation
    File file=new File("soapRequest/add.xml.xml");
    FileInputStream fileinputstream=new FileInputStream(file);
    String requestBody = IOUtils.toString(fileinputstream,"utf-8");

    if (file.exists()){

      System.out.println(">> File Exists");
    }


    baseURI="http://www.dneonline.com";

    given().
        contentType("text/xml").
        accept("ContentType.XML").
        body(requestBody).
        when().
        post("/calculator.asmx").
        then().
        statusCode(200).log().all().
        and().
        //To test the xml Xpath
            body("//*:AddResult.text()",equalTo("8"));

  }

}


