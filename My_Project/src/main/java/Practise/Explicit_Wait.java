package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Explicit_Wait {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        WebDriverWait Mywait=new WebDriverWait(driver, Duration.ofSeconds(30));


        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Selenium");
        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);

        //Explicit Wait

        WebElement element=Mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[normalize-space()='Selenium']")));
        element.click();








    }
}
