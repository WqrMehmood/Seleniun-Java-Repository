package Practise;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.Text;
import java.util.concurrent.TimeUnit;

public class Auto_suggest_option_picker {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.twoplugs.com/");
        driver.findElement(By.xpath("//*[@id=\"details-button\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"proceed-link\"]")).click();
        driver.findElement(By.xpath("/html/body/div/header/div/nav/ul/li[2]/a")).click();

        //adding values to searchbox

        WebElement searchbox=driver.findElement(By.xpath("//*[@id=\"autocomplete\"]"));
        searchbox.clear();
        Thread.sleep(3000);
        searchbox.sendKeys("Toronto");

        Thread.sleep(3000);


        String text;
        do {
            searchbox.sendKeys(Keys.ARROW_DOWN);
            text=searchbox.getAttribute("value");
            System.out.println(text);
            if (text.equals("Toronto NSW, Australia")){

                searchbox.sendKeys(Keys.ENTER);
                break;
            }
            Thread.sleep(3000);
        }

        while (!text.isEmpty());
    }
}
