package scripts;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.time.Duration;

public class HandleShadowElement {
    @Test
    public void test() throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://staging.tidely.com/login");
        Thread.sleep(10000);
        driver.findElement(By.cssSelector("body > flt-glass-pane")).getShadowRoot().findElement(By.cssSelector( "[name=\"username\"]" )).sendKeys("google@google.com");
    }
}
