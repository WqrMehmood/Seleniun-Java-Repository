package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Multiple_Shadow_Doms {

    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://shop.polymer-project.org/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement shop=driver.findElement(By.tagName("shop-app"));

        JavascriptExecutor java=(JavascriptExecutor) driver;
        WebElement field=(WebElement) java.executeScript("return document.querySelector(\"body > shop-app\").shadowRoot.querySelector(\"iron-pages > shop-home\").shadowRoot.querySelector(\"div:nth-child(2) > shop-button > a\")");
        field.click();





    }
}
