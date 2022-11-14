package Practise;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Double_Click_Action {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");

        //entering in to the frame
        driver.switchTo().frame("iframeResult");

        WebElement firstfield=driver.findElement(By.id("field1"));
        firstfield.clear();
        firstfield.sendKeys("Welcome to Selenium");

        //performing double click action

        WebElement Button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
        Actions act=new Actions(driver);
        act.doubleClick(Button).perform();








    }
}
