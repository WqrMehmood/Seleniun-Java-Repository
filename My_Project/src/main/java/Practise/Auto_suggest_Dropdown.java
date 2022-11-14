package Practise;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

import java.time.Duration;
import java.util.List;

public class Auto_suggest_Dropdown {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();
        driver.get("https://www.bing.com/?toWww=1&redig=1E88577A3C8E4753972337FBEF23FCAD#");
        driver.findElement(By.id("sb_form_q")).sendKeys("selenium");

        //getting all values from auto suggest list
        List<WebElement> autosuggestlist = driver.findElements(By.xpath("//div[@class='sa_as']//li//span"));
        System.out.println("the items available are:" + autosuggestlist.size());


        for (WebElement options:autosuggestlist){

            if (options.getText().equals("selenium webdriver")){

                options.click();
                break;
            }

        }



    }
}
