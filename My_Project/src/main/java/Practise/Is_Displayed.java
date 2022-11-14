package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Is_Displayed {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        driver.manage().window().maximize();

        //checking the Male radio button is displayed/Enabled/Is Selected

        //WebElement Radiobutton=driver.findElement(By.xpath("//input[@id='gender-male']"));
        // System.out.println("The status of radio button is displayed:"+ Radiobutton.isDisplayed()); //true
        //  System.out.println("The status of radio button is enabled:"+ Radiobutton.isEnabled());   //true
        // System.out.println("The status of radio button is selected:"+ Radiobutton.isSelected());    //false


        //male radio button is selected

        //  WebElement MaleRadiobutton=driver.findElement(By.xpath("//input[@id='gender-male']"));
        // MaleRadiobutton.click();

        //  System.out.println("The status of radio button is displayed:"+ MaleRadiobutton.isDisplayed()); //true
        // System.out.println("The status of radio button is enabled:"+ MaleRadiobutton.isEnabled());   //true
        // System.out.println("The status of radio button is selected:"+ MaleRadiobutton.isSelected());    //True


        //Female button is selected


        WebElement femaleradiobutton=driver.findElement(By.xpath("//input[@id='gender-female']"));
        femaleradiobutton.click();

        System.out.println("The status of radio button is displayed:"+ femaleradiobutton.isDisplayed()); //true
        System.out.println("The status of radio button is enabled:"+ femaleradiobutton.isEnabled());   //true
        System.out.println("The status of radio button is selected:"+ femaleradiobutton.isSelected());    //True



    }
}
