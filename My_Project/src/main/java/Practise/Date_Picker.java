package Practise;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Picker {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.redbus.in/");

        //opens tha date picker
        driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();

        //Month and Year selection

        String Year="2022";
        String Month="Dec";
        String Date="13";


        while (true){

            String monthyear=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();

            String arr[]=monthyear.split(" ");
            String mon=arr[0];
            String yr=arr[1];

            if(mon.equals(Month)  && yr.equals(Year))
                break;

            else
                driver.findElement(By.xpath("//td[@class='next']")).click();
        }

        //Date selection

        List<WebElement> alldates=driver.findElements(By.xpath("//tbody//tr//td"));

        for (WebElement datelist:alldates){

            if (datelist.getText().equals(Date)){
                datelist.click();
            }
        }

    }

}
