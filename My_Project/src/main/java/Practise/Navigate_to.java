package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate_to {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //navigate back and refresh page

        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        driver.get("https://www.snapdeal.pk/");
        driver.navigate().back();
        driver.navigate().refresh();





    }
}
