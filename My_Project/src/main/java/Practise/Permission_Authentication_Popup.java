package Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Permission_Authentication_Popup {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\Chromedriver.exe");
        ChromeOptions options=new ChromeOptions();

        //how to disable popup notification

        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();



        driver.get("https://www.redbus.in/");


    }


}
