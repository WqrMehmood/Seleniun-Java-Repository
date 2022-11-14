package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_Attribute {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/register");

        //finding and get value of Get Attribute

        WebElement attribute=driver.findElement(By.xpath("//input[@id='FirstName']"));
        System.out.println("The type of get atribute is:"+ attribute.getAttribute("type"));  //test
        System.out.println("The type of get atribute is:"+ attribute.getAttribute("id"));    //FirstName
        System.out.println("The type of get atribute is:"+ attribute.getAttribute("data-val-required")); //First name is required.



    }
}
