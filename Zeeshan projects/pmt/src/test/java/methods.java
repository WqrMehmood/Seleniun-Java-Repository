
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class methods {
    static WebDriver driver;

    public static void loginS() {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            driver.get("https://cdemo.cornpos.app/");

            getElement(By.id("Username")).sendKeys("manager");
            driver.findElement(By.id("Password")).sendKeys("TS@1122");
            driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div/form/div/div[2]/button/span")).submit();
            System.out.println("Login successful");
        }
        public static void teamsuitelogin(){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            driver.get("https://demo.teamsuite.pk/");
            getElement(By.id("input-19")).sendKeys("Sidra");
            driver.findElement(By.id("input-20")).sendKeys("Sidra@123");
            driver.findElement(By.xpath("//i[contains(@class,'v-icon notranslate v-icon--right mdi mdi-login theme--dark')]")).submit();

        }
    public static WebElement getElement(By by){

        return driver.findElement(by);
    }

    public static void chromesetup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();





    }
    }



