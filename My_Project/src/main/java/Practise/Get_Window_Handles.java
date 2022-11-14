package Practise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.Text;
import java.util.concurrent.TimeUnit;

public class Get_Window_Handles {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //get single window handle

        //  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.get("https://demo.nopcommerce.com/");
        // String windowID=driver.getWindowHandle();
        //System.out.println(windowID);   //CDwindow-B61B6239483AE5C67E3140B4A66B23CD


        //get multiple window handles
        // driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Facebook']")).click();

        //getting windows handles
        Set<String> handles=driver.getWindowHandles();

        //first method <Iterator>
        // Iterator<String> hand=handles.iterator();

        //String ParentwindowID= hand.next();
        // String ChildwindowID= hand.next();

        //  System.out.println("The parent window ID:"+ParentwindowID);
        //  System.out.println("The Child window ID:"+ChildwindowID);


        //using array method

        List<String> windowIDList=new ArrayList(handles);

        String ParentWindowID= windowIDList.get(0);  //gets parent window id
        String ChildWindowID= windowIDList.get(1);  //gets Child window id

        System.out.println("Parent window ID:"+ParentWindowID);
        System.out.println("Child window ID:"+ChildWindowID);

        //how to switch between windows

        driver.switchTo().window(ParentWindowID);
        System.out.println("The parent window ID"+driver.getTitle());

        driver.switchTo().window(ChildWindowID);
        System.out.println("the child window ID"+driver.getTitle());




    }
}
