package Practise;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Mouse_Right_Click_Action {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

        WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

        Actions act=new Actions(driver);
        act.contextClick(button).perform();  //performs right click button






    }
}
