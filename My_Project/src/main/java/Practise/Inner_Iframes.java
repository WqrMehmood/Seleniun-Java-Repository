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
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.Text;


public class Inner_Iframes {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();



        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();

        //moving to outer iframe

        WebElement Outerframe=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
        driver.switchTo().frame(Outerframe);

        //moving to inner iframe

        WebElement innerframe=driver.findElement(By.xpath("//iframe[normalize-space()='<p>Your browser does not support iframes.</p>']"));
        driver.switchTo().frame(innerframe);

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome");

    }
}
