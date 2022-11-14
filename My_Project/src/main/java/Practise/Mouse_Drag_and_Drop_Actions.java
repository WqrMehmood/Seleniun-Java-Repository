package Practise;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Drag_and_Drop_Actions {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        //drag and drop items

        WebElement OsloBox=driver.findElement(By.id("box1"));
        WebElement ItalyBox=driver.findElement(By.id("box106"));
        WebElement Stockholm= driver.findElement(By.id("box2"));
        WebElement SpainBox=driver.findElement(By.id("box107"));

        Actions act=new Actions(driver);
        act.dragAndDrop(OsloBox,ItalyBox).perform();
        act.dragAndDrop(Stockholm,SpainBox).perform();







    }
}
