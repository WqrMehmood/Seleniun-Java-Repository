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

public class Java_Script_popup {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        //allert window with ok button

        // driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        //Thread.sleep(3000);
        //driver.switchTo().alert().accept();

        //allert with ok and cancel button

        //driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        //driver.switchTo().alert().accept();  //accept
        //driver.switchTo().alert().dismiss();  //dismiss

        //allert by sending keys and then click ok

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        driver.switchTo().alert().sendKeys("My Alert");
        Thread.sleep(3000);
        driver.switchTo().alert().accept();





    }
}
