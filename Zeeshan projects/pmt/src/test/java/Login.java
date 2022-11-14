import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Login extends methods {

    @Test
    public static void loginz() throws Exception {
        methods.loginS();
        driver.findElement(By.xpath(PageObjects.inventory)).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1300)", "");


        //Adding a new category and edit the category

        driver.findElement(By.xpath(PageObjects.category)).click();
        driver.findElement(By.xpath(PageObjects.addcategory)).click();
        Thread.sleep(300);

        String categoryName = "Test Category";
        driver.findElement(By.xpath(PageObjects.categorysortorder)).sendKeys("5");
        WebElement ee = driver.findElement(By.xpath(PageObjects.categoryname));
        ee.sendKeys(categoryName);
        driver.findElement(By.xpath(PageObjects.savecategory)).submit();
        driver.findElement(By.xpath(PageObjects.closecategory)).click();
        //try{
        driver.findElement(By.xpath("//div[@class='v-treeview-node__label'][contains(.,'" + categoryName + "')]"));
        Assert.assertTrue(driver.findElement(By.xpath("(//div[@class=\"v-treeview-node__label\"])[last()]")).getText().contains(categoryName));
        //Assert.assertEquals(driver.findElement(By.xpath("(//div[@class=\"v-treeview-node__label\"])[last()]")).getAttribute("value"),categoryName);
//        }catch (Exception e){
//            throw new Exception("Test category not found!");
//        }

        System.out.println("category with name Test Category Added");


    }

    @Test
    public static void editcategory() {
        methods.loginS();
        driver.findElement(By.xpath(PageObjects.inventory)).click();
        driver.findElement(By.xpath(PageObjects.category)).click();
        driver.findElement(By.xpath(PageObjects.categoryeditpencil)).click();
        driver.findElement(By.xpath(PageObjects.categoryeditname)).click();
        driver.findElement(By.xpath(PageObjects.categoryeditname)).clear();


    }

    @Test
    public static void teamsuitetesting() {
        methods.teamsuitelogin();  //will login to teamsuite demo
        String expensetypename = "lunch";
        driver.findElement(By.xpath(PageObjects.HRdepartment)).click();
        driver.findElement(By.xpath(PageObjects.expensetype)).click();
        driver.findElement(By.xpath(PageObjects.nameofexpensetype)).sendKeys(expensetypename);
        driver.findElement(By.xpath(PageObjects.natureexpensetype)).click();
        driver.findElement(By.xpath(PageObjects.getNatureexpensetypeddl)).click();
        driver.findElement(By.xpath(PageObjects.discription)).sendKeys("For Lunch Of a Day");
        driver.findElement(By.xpath(PageObjects.maxamount)).sendKeys("1000");
        driver.findElement(By.xpath(PageObjects.advaceamount)).sendKeys("500");
        driver.findElement(By.xpath(PageObjects.ECB)).click();
        driver.findElement(By.xpath(PageObjects.ECBddl)).click();
        driver.findElement(By.xpath(PageObjects.limitcheckbox)).click();
        driver.findElement(By.xpath(PageObjects.saveexpensetype)).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2500)", "");

        driver.findElement(By.xpath("(//td[@class='text-start'][contains(.,'" + expensetypename + "')])[1]"));
        Assert.assertTrue(driver.findElement(By.xpath("(//td[contains(@class,'text-start')])[74]")).getText().contains(expensetypename));


        // Select natureexpensetype = new Select(driver.findElement(By.xpath(PageObjects.natureexpensetype)));
        // driver.findElement(By.xpath(PageObjects.natureexpensetype)).click();

        //  natureexpensetype.selectByVisibleText("Fixed");
        // natureexpensetype.selectByIndex(1);


    }



    @Test
    public static void shadow() throws InterruptedException {

            WebDriverManager.chromedriver().setup();
           driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("chrome://downloads/");
            Thread.sleep(10000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            WebElement search = (WebElement)js.executeScript("return document.querySelector(\"body > downloads-manager\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")");
            search.sendKeys("alfha");

        }
        @Test
        public static void careers() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://careers.teamsuite.app/careers/admin/settings/user");
        Thread.sleep(10000);
        driver.findElement(By.xpath("(//input[contains(@type,'text')])[1]")).sendKeys("admin@admin.com");
        driver.findElement(By.xpath("(//input[contains(@type,'password')])[1]")).sendKeys("12345");
        driver.findElement(By.xpath("(//button[contains(@type,'submit')])[1]")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//div[@class='v-list-item__title'][contains(.,'Settings')]")).click();
            Thread.sleep(10000);

            driver.findElement(By.xpath("//div[@class='v-list-item__title'][contains(.,'User')]")).click();
            Thread.sleep(10000);

            driver.findElement(By.xpath("//span[@class='v-btn__content'][contains(.,'Add User')]")).click();

        }






@Test(priority = 1)

public static void purchaseorder() throws InterruptedException {
        methods.loginS();
        getElement(By.xpath("(//i[contains(@aria-hidden,'true')])[2]")).click();
        getElement(By.xpath("(//i[contains(@aria-hidden,'true')])[16]")).click();
        Thread.sleep(5000);
        getElement(By.xpath("(//span[contains(@class,'v-btn__content')])[3]")).click();
        getElement(By.xpath("(//input[contains(@type,'text')])[5]")).click();
        getElement(By.xpath("(//div[contains(@class,'v-list-item__title')])[8]")).click();
        getElement(By.xpath("(//input[contains(@role,'button')])[2]")).click();
        getElement(By.xpath("(//input[contains(@role,'button')])[2]")).click();
        Thread.sleep(5000);
        getElement(By.xpath("(//div[@class='v-btn__content'][contains(.,'1')])[1]")).click();
        getElement(By.xpath("(//input[contains(@type,'text')])[7]")).click();
        getElement(By.xpath("(//input[contains(@type,'text')])[7]")).sendKeys("Arfa IT Tower");
       getElement(By.xpath("(//input[contains(@type,'text')])[8]")).click();
       getElement(By.xpath("//div[@class='v-list-item__title'][contains(.,'Bose Sound Bar - 700')]")).click();
       getElement(By.xpath("(//input[contains(@type,'number')])[3]")).sendKeys("5");
       getElement(By.xpath("(//input[contains(@type,'text')])[12]")).click();
       getElement(By.xpath("//div[@class='v-list-item__title'][contains(.,'Pakistani rupee')]")).click();
       getElement(By.xpath("(//input[contains(@type,'text')])[13]")).click();
       getElement(By.xpath("//div[@class='v-list-item__content'][contains(.,'Cash Payment')]")).click();
       getElement(By.xpath("//span[@class='v-btn__content'][contains(.,'Save')]")).click();
       //Purchase order is saved
    if(getElement(By.xpath("(//td[contains(@class,'text-start')])[6]"))!= null){
        System.out.println("Element is Present");
    }else{
        System.out.println("Element is Absent");

    }
}


    @Test
    public static void travelrequest() throws InterruptedException {
        methods.teamsuitelogin();
        getElement(By.xpath(PageObjects.HRdepartment)).click();
        getElement(By.xpath(PageObjects.travelrequest)).click();
        WebElement e1 = driver.findElement(By.xpath(PageObjects.addtravelrequest));
        e1.click();

        String Travelname = "travel request";
        Thread.sleep(30000);
        //WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        //wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(PageObjects.nameofTR))));
        getElement(By.xpath(PageObjects.nameofTR)).sendKeys(Travelname);
        Thread.sleep(10000);
        getElement(By.xpath(PageObjects.hotelcheck)).click();
        getElement(By.xpath(PageObjects.purposeofTravling)).sendKeys("Payment Collection");
        // driver.findElement(By.xpath(PageObjects.oneway)).click();
        getElement(By.xpath(PageObjects.fromlocation)).sendKeys("lahore");
        getElement(By.xpath(PageObjects.cityselect)).click();
        getElement(By.xpath(PageObjects.tolocation)).sendKeys("karachi");
        getElement(By.xpath(PageObjects.tocityselect)).click();
        getElement(By.xpath(PageObjects.travelingmedium)).click();
        getElement(By.xpath(PageObjects.TMDDL)).click();
        Thread.sleep(10000);
        getElement(By.xpath(PageObjects.datetime)).click();
        Thread.sleep(10000);
        getElement(By.xpath(PageObjects.selectdate)).click();
        Thread.sleep(1000);
        getElement(By.xpath(PageObjects.selecttimehour)).click();
        getElement(By.xpath(PageObjects.selecttimemin)).click();
        getElement(By.xpath(PageObjects.datetimeokay)).click();
        getElement(By.xpath(PageObjects.TRsave)).click();
        getElement(By.xpath("(//td[contains(.,'"+Travelname+"')])[1]"));
        Assert.assertTrue(getElement(By.xpath("(//td[@class='text-start'][contains(.,'travel request')])[1]")).getText().contains(Travelname));



    }
    @Test
    public static void tidelysingnup() throws InterruptedException {
        methods.chromesetup();
        Thread.sleep(50000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement email = (WebElement)js.executeScript(waqarojects.singnup);
        Thread.sleep(30000);
        email.sendKeys("test");



    }


    @Test
    public void test() throws Exception {
           methods.chromesetup();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get("https://staging.tidely.com/login");
            Thread.sleep(5000);
            getElement(By.cssSelector("body > flt-glass-pane")).getShadowRoot().findElement(By.cssSelector( "[name=\"username\"]" )).sendKeys("google@google.com");
           // Thread.sleep(3000);
           // getElement(By.cssSelector("body > flt-glass-pane")).getShadowRoot().findElement(By.tagName("form > input#current-password")).sendKeys("pass");


        }


}





