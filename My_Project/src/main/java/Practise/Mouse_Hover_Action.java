package Practise;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover_Action {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.opencart.com/");

        WebElement components=driver.findElement(By.xpath("//a[normalize-space()='Components']"));
        WebElement Scanner=driver.findElement(By.xpath("//a[normalize-space()='Scanners (0)']"));

        Actions act=new Actions(driver);
        act.moveToElement(components).moveToElement(Scanner).click().perform();




    }
}
