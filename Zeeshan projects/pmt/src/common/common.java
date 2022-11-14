import io.github.bonigarcia.wdm.WebDriverManager;


static void common{
public static void main(String[]args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }
}