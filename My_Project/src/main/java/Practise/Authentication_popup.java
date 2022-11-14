package Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Authentication_popup {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //giving the values to the popup username and password
        //Username: admin
        //Password:admin

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");






    }
}
