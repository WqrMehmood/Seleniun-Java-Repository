package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Dom_Elements {

    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://books-pwakit.appspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //method

        //Root Host(shadow host)
        //WebElement Root=driver.findElement(By.tagName("book-app"));

        //Executor(shadow root)

       // JavascriptExecutor jse=(JavascriptExecutor) driver;
       // WebElement Shadow=(WebElement) jse.executeScript("return arguments[0].shadowRoot", Root);

       // WebElement header=Shadow.findElement(By.tagName("app-header"));
       // WebElement toolbar=header.findElement(By.cssSelector("app-toolbar.toolbar-bottom"));
       // WebElement input=toolbar.findElement(By.tagName("book-input-decorator"));

      //  input.findElement(By.cssSelector("input#input")).sendKeys("onlinebooks");


        //working command#1
      // driver.findElement(By.cssSelector("body > book-app")).getShadowRoot().findElement(By.cssSelector("input#input")).sendKeys("books");


        //working command#2
       // JavascriptExecutor jse=(JavascriptExecutor) driver;
       // jse.executeScript("document.querySelector(\"body > book-app\").shadowRoot.querySelector(\"#input\").value=\"books\"");

        //working command#3
         JavascriptExecutor java=(JavascriptExecutor) driver;
         WebElement field=(WebElement) java.executeScript("return document.querySelector(\"body > book-app\").shadowRoot.querySelector(\"#input\")");
        field.sendKeys("online");





    }
}
