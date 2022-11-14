package My_Package;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class First_Test extends methods {



@Test
    public void Test1() throws Exception {

  methods.chromesetup();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  driver.get("https://staging.tidely.com/login");
  driver.findElement(By.cssSelector("body > flt-glass-pane")).getShadowRoot().findElement(By.cssSelector("#username")).sendKeys("username");
  Thread.sleep(1000);
  WebElement element=driver.findElement(By.cssSelector("document.querySelector(\"body > flt-glass-pane\").shadowRoot.querySelector(\"#current-password\")"));
  element.sendKeys("bbdnmuyd");


//method 1

  //flt-glass-pane
  //WebElement flt=driver.findElement(By.cssSelector("body > flt-glass-pane"));
  //shadow dom
  //JavascriptExecutor j=(JavascriptExecutor) driver;
 // WebElement shadowdom=(WebElement) j.executeScript("return arguments[0].shadowRoot",flt);
  //form
  //WebElement form=shadowdom.findElement(By.tagName("form"));
  //input
 // form.findElement(By.cssSelector("input#current-password")).sendKeys("hhnsb");





  //method 3

 // JavascriptExecutor jse = (JavascriptExecutor) driver;
  //WebElement password = (WebElement) jse.executeScript("return document.querySelector(\"body > flt-glass-pane\").shadowRoot.querySelector(\"#current-password\")");
 // password.sendKeys("passw");

//  String js = "arguments[0].setAttribute('value','kkkkkk')";
//  jse.executeScript(js, element);


}

}
