package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdowns {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.opencart.com/index.php?route=account/register");

        //to select country from drop down menu

        WebElement drpdwn = driver.findElement(By.id("input-country"));
        Select dropdown = new Select(drpdwn);
        // dropdown.selectByVisibleText("Nepal"); //Nepal selected
        //dropdown.selectByIndex(5);        //Angola selected
        //dropdown.selectByValue("12");       //Aruba selected

        //selecting all options without using methods

        List<WebElement> drop_down_list = dropdown.getOptions();

        for (WebElement list : drop_down_list) {

            if (list.getText().equals("Cape Verde")) {
                list.click();
                break;
            }
        }


        //by using own method used for option selection

        // WebElement noofEmployes = driver.findElement((By.name("NoofEmployees")));
        // selectOptionsFromDropDown(noofEmployes, "16-20");


        // WebElement industryEle = driver.findElement((By.name("Industry")));
        //  selectOptionsFromDropDown(industryEle, "Healthcare");

        // WebElement country = driver.findElement((By.name("Country")));
        // selectOptionsFromDropDown(country, "Ghana");
    }

    // public static void selectOptionsFromDropDown (WebElement ele, String value){

    //   Select drp = new Select(ele);
    //   List<WebElement> alloptions = drp.getOptions();
    //  for (WebElement option : alloptions) {
    //     if (option.getText().equals(value)) {

    //         option.click();
    //         break;
    //    }

    //   }


    //  }

}


