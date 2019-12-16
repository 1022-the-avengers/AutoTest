package unify;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Main {

    //    public static void main(String[] args) throws Exception{
////        System.setProperty("webdriver.chrome.driver","./src/chromedriver.exe");
////        WebDriver driver = new ChromeDriver();
////        driver.get("http://www.baidu.com");
////        Thread.sleep(3000);
////        driver.quit();
//    }
    public static WebDriver driver;

    @BeforeClass
    public static void setUp() throws Exception {
        System.out.println("启动浏览器");
        System.setProperty("webdriver.chrome.driver","./src/chromedriver.exe");
        driver = new ChromeDriver();
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
