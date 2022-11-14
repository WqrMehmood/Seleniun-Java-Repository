package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class Implicit_Wait {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();



        driver.get("https://www.google.com/");

        //Implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Selenium");
        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);

        driver.findElement(By.xpath("//h3[normalize-space()='Selenium']")).click();



    }
}
