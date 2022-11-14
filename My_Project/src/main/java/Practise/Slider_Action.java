package Practise;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider_Action {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.jqueryscript.net/demo/track-volume-oyo/");

        WebElement slider=driver.findElement(By.xpath("//body/div[@class='container']/div[@class='oyocontrolspanel']/div[1]"));

        System.out.println("The location of element is"+slider.getLocation());  //getting location
        System.out.println("The size of element is"+slider.getSize());  //getting size

        Actions act=new Actions(driver);
        act.dragAndDropBy(slider,-40,0).perform();











    }
}
