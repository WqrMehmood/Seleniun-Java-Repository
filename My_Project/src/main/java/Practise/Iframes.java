package Practise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.Text;
import java.util.concurrent.TimeUnit;


public class Iframes {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");

        //1st frame
        driver.switchTo().frame("packageListFrame");
        driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium']")).click();
        driver.switchTo().defaultContent();

        //2nd frame
        driver.switchTo().frame("packageFrame");
        driver.findElement(By.xpath("//span[normalize-space()='WebDriver']")).click();
        driver.switchTo().defaultContent();

        //3rd frame
        driver.switchTo().frame("classFrame");
        driver.findElement(By.xpath("//div[@class='topNav']//a[normalize-space()='Use']")).click();
        driver.switchTo().defaultContent();






    }


}
