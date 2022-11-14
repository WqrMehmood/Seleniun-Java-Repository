package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class mltpl_Shadowroots {

    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://shop.polymer-project.org/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement root = driver.findElement(By.tagName("shop-app")); //Root 1
        WebElement Shadowdom1 = getShadowDom(root, driver);

        WebElement iron=Shadowdom1.findElement(By.tagName("iron-pages"));
        WebElement shophome=iron.findElement(By.tagName("shop-home")); //Root 2

        WebElement Shadowdom2=getShadowDom(shophome,driver);
        Shadowdom2.findElement(By.cssSelector("div:nth-child(2) > shop-button > a")).click();

    }



        static WebElement getShadowDom(WebElement element, WebDriver driver){

            JavascriptExecutor js=(JavascriptExecutor) driver;
            WebElement Shadowdom1=(WebElement) js.executeScript("return arguments[0].shadowRoot", element);
            return Shadowdom1;

        }










}
