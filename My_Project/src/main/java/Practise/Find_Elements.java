package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

public class Find_Elements {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        driver.manage().window().maximize();

        //capturing number of list items

        List<WebElement> listitems=driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
        System.out.println("The total no of list items are:"+listitems.size());  //22
        for (WebElement list:listitems)
            System.out.println("The list items are:"+ list.getText());
    }
}
