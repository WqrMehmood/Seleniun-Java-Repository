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


public class Inner_Iframes_2 {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_border2");

        //moving to outer frame
        WebElement outerframe=driver.findElement(By.xpath("//*[@id=\"iframeResult\"]"));
        driver.switchTo().frame(outerframe);


        //moving to inner frame

        WebElement innerframe=driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
        driver.switchTo().frame(innerframe);
        WebElement frame2text=driver.findElement(By.xpath("/html/body/h1"));
        System.out.println(frame2text.getText());

        //moving back to parent frame #outer frame
        driver.switchTo().parentFrame();
        WebElement test=driver.findElement(By.xpath("/html/body/p"));
        System.out.println(test.getText());




    }
}
