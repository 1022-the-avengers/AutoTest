package unify;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Main {

    //    public static void main(String[] args) throws Exception{
////        System.setProperty("webdriver.chrome.driver","./src/chromedriver.exe");
////        WebDriver driver = new ChromeDriver();
////        driver.get("http://www.baidu.com");
////        Thread.sleep(3000);
////        driver.quit();
//    }
    public static WebDriver driver;
    public static String BaseURL = "http://localhost:8088";

    public static String email = "lfl@gmail.com";
    public static String psw = "123456789";

    @BeforeClass
    public static void setUp() throws Exception {

        System.out.println("启动浏览器");
        System.setProperty("webdriver.chrome.driver","./src/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("退出浏览器");
        driver.quit();
    }

//    @Test
//    public void str() {
//        System.out.println("string");
//    }
//
//    @Test
//    public void hello() {
//        System.out.println("hello");
//    }

}
