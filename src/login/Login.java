package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import unify.*;

public class Login {
    String LoginURL = "http://localhost:8088/#/";    //登录网址
    String SuccessURL = "http://localhost:8088/#/main";    //登录成功网址
    String email = "fc@gmail.com";
    String psw = "123456789";

    @Test
    public void login()throws Exception{
        Main.setUp();
        Main.driver.get(LoginURL);
        Thread.sleep(3000);
        WebElement email = Main.driver.findElement(By.name("user_login"));
        WebElement psw = Main.driver.findElement(By.name("user_pass"));
        WebElement button = Main.driver.findElement(By.cssSelector(".btn_login"));
        email.sendKeys(this.email);
        psw.sendKeys(this.psw);
        button.click();
        Thread.sleep(3000);

        String current_url = Main.driver.getCurrentUrl();
        try {
            Assert.assertEquals(current_url,this.SuccessURL,"登录测试失败");
        }catch (Exception e){
            Main.tearDown();
        }
    }
}
